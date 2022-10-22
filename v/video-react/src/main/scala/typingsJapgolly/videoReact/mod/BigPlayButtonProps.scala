package typingsJapgolly.videoReact.mod

import typingsJapgolly.videoReact.videoReactStrings.`left-bottom`
import typingsJapgolly.videoReact.videoReactStrings.`left-top`
import typingsJapgolly.videoReact.videoReactStrings.`right-bottom`
import typingsJapgolly.videoReact.videoReactStrings.`right-top`
import typingsJapgolly.videoReact.videoReactStrings.center
import typingsJapgolly.videoReact.videoReactStrings.left
import typingsJapgolly.videoReact.videoReactStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigPlayButtonProps extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Determines the position of the big play button.
    */
  var position: js.UndefOr[
    center | left | `left-top` | `left-bottom` | right | `right-top` | `right-bottom`
  ] = js.undefined
}
object BigPlayButtonProps {
  
  inline def apply(): BigPlayButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigPlayButtonProps]
  }
  
  extension [Self <: BigPlayButtonProps](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setPosition(value: center | left | `left-top` | `left-bottom` | right | `right-top` | `right-bottom`): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
