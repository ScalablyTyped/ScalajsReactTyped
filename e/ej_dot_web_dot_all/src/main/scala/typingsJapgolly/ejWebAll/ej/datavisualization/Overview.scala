package typingsJapgolly.ejWebAll.ej.datavisualization

import typingsJapgolly.ejWebAll.ej.Model
import typingsJapgolly.ejWebAll.ej.Widget_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Overview
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  @JSName("model")
  var model_Overview: Model = js.native
}
object Overview {
  
  trait Model extends StObject {
    
    /** Defines the height of the overview
      * @Default {400}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** The sourceId property of overview should be set with the corresponding Diagram ID for you need the overall view.
      * @Default {null}
      */
    var sourceID: js.UndefOr[String] = js.undefined
    
    /** Defines the width of the overview
      * @Default {250}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typingsJapgolly.ejWebAll.ej.datavisualization.Overview.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.ejWebAll.ej.datavisualization.Overview.Model]
    }
    
    extension [Self <: typingsJapgolly.ejWebAll.ej.datavisualization.Overview.Model](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setSourceID(value: String): Self = StObject.set(x, "sourceID", value.asInstanceOf[js.Any])
      
      inline def setSourceIDUndefined: Self = StObject.set(x, "sourceID", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
