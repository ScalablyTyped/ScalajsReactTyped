package typingsJapgolly.devextreme.mod.DevExpress.ui

import typingsJapgolly.devextreme.anon.Right
import typingsJapgolly.devextreme.devextremeStrings.`bottom center`
import typingsJapgolly.devextreme.devextremeStrings.`bottom left`
import typingsJapgolly.devextreme.devextremeStrings.`bottom right`
import typingsJapgolly.devextreme.devextremeStrings.`down-push`
import typingsJapgolly.devextreme.devextremeStrings.`down-stack`
import typingsJapgolly.devextreme.devextremeStrings.`left center`
import typingsJapgolly.devextreme.devextremeStrings.`left-push`
import typingsJapgolly.devextreme.devextremeStrings.`left-stack`
import typingsJapgolly.devextreme.devextremeStrings.`right center`
import typingsJapgolly.devextreme.devextremeStrings.`right-push`
import typingsJapgolly.devextreme.devextremeStrings.`right-stack`
import typingsJapgolly.devextreme.devextremeStrings.`top center`
import typingsJapgolly.devextreme.devextremeStrings.`top left`
import typingsJapgolly.devextreme.devextremeStrings.`top right`
import typingsJapgolly.devextreme.devextremeStrings.`up-push`
import typingsJapgolly.devextreme.devextremeStrings.`up-stack`
import typingsJapgolly.devextreme.devextremeStrings.center
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stack extends StObject {
  
  /**
    * 
    */
  var direction: js.UndefOr[
    `down-push` | `up-push` | `left-push` | `right-push` | `down-stack` | `up-stack` | `left-stack` | `right-stack`
  ] = js.undefined
  
  /**
    * 
    */
  var position: js.UndefOr[
    (`top left`) | (`top right`) | (`bottom left`) | (`bottom right`) | (`top center`) | (`bottom center`) | (`left center`) | (`right center`) | center | Right
  ] = js.undefined
}
object Stack {
  
  inline def apply(): Stack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stack]
  }
  
  extension [Self <: Stack](x: Self) {
    
    inline def setDirection(
      value: `down-push` | `up-push` | `left-push` | `right-push` | `down-stack` | `up-stack` | `left-stack` | `right-stack`
    ): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setPosition(
      value: (`top left`) | (`top right`) | (`bottom left`) | (`bottom right`) | (`top center`) | (`bottom center`) | (`left center`) | (`right center`) | center | Right
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
