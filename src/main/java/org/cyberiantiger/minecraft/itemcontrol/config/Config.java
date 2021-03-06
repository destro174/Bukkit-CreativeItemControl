/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cyberiantiger.minecraft.itemcontrol.config;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author antony
 */
public class Config {
    private int rateLimit = -1;
    private int rateLimitTime = 1200;
    private Map<String, Blacklist> blacklist;
    private Action unavailable;
    private Action nopermission;
    private Action blacklisted;
    private Action onRateLimit;
    private Set<String> whitelist;
    private Set<String> allowedItems;

    public Map<String, Blacklist> getBlacklist() {
        return blacklist == null ? Collections.emptyMap() : blacklist;
    }

    public Action getUnavailable() {
        return unavailable;
    }

    public Action getNopermission() {
        return nopermission;
    }

    public Action getBlacklisted() {
        return blacklisted;
    }

    public Action getOnRateLimit() {
        return onRateLimit;
    }

    public Set<String> getWhitelist() {
        return whitelist == null ? Collections.emptySet() : whitelist;
    }

    public Set<String> getAllowedItems() {
        return allowedItems == null ? Collections.emptySet() : allowedItems;
    }

    public int getRateLimit() {
        return rateLimit;
    }

    public int getRateLimitTime() {
        return rateLimitTime;
    }
}