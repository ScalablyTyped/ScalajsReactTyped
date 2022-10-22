package typingsJapgolly.reactBulmaComponents.anon

import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`2`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`3`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`4`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`5`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`6`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`7`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.center
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.justify
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.left
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.right
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.DisplayModifier
import typingsJapgolly.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-bulma-components.react-bulma-components/src/components.ResponsiveModifiers & {  only :std.Boolean | undefined} */
trait ResponsiveModifiersonlyBo extends StObject {
  
  var display: js.UndefOr[DisplayModifier] = js.undefined
  
  var invisible: js.UndefOr[Boolean] = js.undefined
  
  var only: js.UndefOr[Boolean] = js.undefined
  
  var textAlign: js.UndefOr[center | justify | left | right] = js.undefined
  
  var textSize: js.UndefOr[
    typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`1` | `2` | `3` | `4` | `5` | `6` | `7` | Number | String
  ] = js.undefined
}
object ResponsiveModifiersonlyBo {
  
  inline def apply(): ResponsiveModifiersonlyBo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsiveModifiersonlyBo]
  }
  
  extension [Self <: ResponsiveModifiersonlyBo](x: Self) {
    
    inline def setDisplay(value: DisplayModifier): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    inline def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
    
    inline def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
    
    inline def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
    
    inline def setTextAlign(value: center | justify | left | right): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setTextSize(
      value: typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`1` | `2` | `3` | `4` | `5` | `6` | `7` | Number | String
    ): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
    
    inline def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
  }
}
