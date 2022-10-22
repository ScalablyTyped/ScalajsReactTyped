package typingsJapgolly.reactNativeWindows.rntypesMod

import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.all_
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.balanced
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.email
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.full
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.high
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.highQuality
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.link
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.none
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.normal_
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.phoneNumber
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.simple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextPropsAndroid extends StObject {
  
  /**
    * Hyphenation strategy
    */
  var android_hyphenationFrequency: js.UndefOr[normal_ | none | full | high | balanced] = js.undefined
  
  /**
    * Determines the types of data converted to clickable URLs in the text element.
    * By default no data types are detected.
    */
  var dataDetectorType: js.UndefOr[Null | phoneNumber | link | email | none | all_] = js.undefined
  
  /**
    * Lets the user select text, to use the native copy and paste functionality.
    */
  var selectable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The highlight color of the text.
    */
  var selectionColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * Set text break strategy on Android API Level 23+
    * default is `highQuality`.
    */
  var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.undefined
}
object TextPropsAndroid {
  
  inline def apply(): TextPropsAndroid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextPropsAndroid]
  }
  
  extension [Self <: TextPropsAndroid](x: Self) {
    
    inline def setAndroid_hyphenationFrequency(value: normal_ | none | full | high | balanced): Self = StObject.set(x, "android_hyphenationFrequency", value.asInstanceOf[js.Any])
    
    inline def setAndroid_hyphenationFrequencyUndefined: Self = StObject.set(x, "android_hyphenationFrequency", js.undefined)
    
    inline def setDataDetectorType(value: phoneNumber | link | email | none | all_): Self = StObject.set(x, "dataDetectorType", value.asInstanceOf[js.Any])
    
    inline def setDataDetectorTypeNull: Self = StObject.set(x, "dataDetectorType", null)
    
    inline def setDataDetectorTypeUndefined: Self = StObject.set(x, "dataDetectorType", js.undefined)
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setSelectionColor(value: ColorValue): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
    
    inline def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
    
    inline def setTextBreakStrategy(value: simple | highQuality | balanced): Self = StObject.set(x, "textBreakStrategy", value.asInstanceOf[js.Any])
    
    inline def setTextBreakStrategyUndefined: Self = StObject.set(x, "textBreakStrategy", js.undefined)
  }
}
