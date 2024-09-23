package be.vives.ti;

import org.apache.commons.lang3.StringUtils;

public class StringProcessor {
    public String appendIfMissing(String str, String suffix){
            return StringUtils.appendIfMissing(str, suffix);
    }
}
