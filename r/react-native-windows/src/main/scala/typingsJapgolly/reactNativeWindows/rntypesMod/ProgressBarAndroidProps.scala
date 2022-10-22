package typingsJapgolly.reactNativeWindows.rntypesMod

import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.Horizontal
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.Inverse
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.Large
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.LargeInverse
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.Normal
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.Small
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.SmallInverse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressBarAndroidProps
  extends StObject
     with ViewProps {
  
  /**
    * Whether to show the ProgressBar (true, the default) or hide it (false).
    */
  var animating: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Color of the progress bar.
    */
  var color: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * If the progress bar will show indeterminate progress.
    * Note that this can only be false if styleAttr is Horizontal.
    */
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The progress value (between 0 and 1).
    */
  var progress: js.UndefOr[Double] = js.undefined
  
  /**
    * Style of the ProgressBar. One of:
    Horizontal
    Normal (default)
    Small
    Large
    Inverse
    SmallInverse
    LargeInverse
    */
  var styleAttr: js.UndefOr[Horizontal | Normal | Small | Large | Inverse | SmallInverse | LargeInverse] = js.undefined
}
object ProgressBarAndroidProps {
  
  inline def apply(): ProgressBarAndroidProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarAndroidProps]
  }
  
  extension [Self <: ProgressBarAndroidProps](x: Self) {
    
    inline def setAnimating(value: Boolean): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
    
    inline def setAnimatingUndefined: Self = StObject.set(x, "animating", js.undefined)
    
    inline def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    
    inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setStyleAttr(value: Horizontal | Normal | Small | Large | Inverse | SmallInverse | LargeInverse): Self = StObject.set(x, "styleAttr", value.asInstanceOf[js.Any])
    
    inline def setStyleAttrUndefined: Self = StObject.set(x, "styleAttr", js.undefined)
  }
}
