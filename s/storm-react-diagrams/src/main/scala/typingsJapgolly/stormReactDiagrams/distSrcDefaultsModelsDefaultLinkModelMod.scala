package typingsJapgolly.stormReactDiagrams

import japgolly.scalajs.react.Callback
import typingsJapgolly.stormReactDiagrams.anon.BaseEventDefaultLinkModel
import typingsJapgolly.stormReactDiagrams.anon.BaseEventDefaultLinkModelEntity
import typingsJapgolly.stormReactDiagrams.distSrcModelsLinkModelMod.LinkModel
import typingsJapgolly.stormReactDiagrams.distSrcModelsLinkModelMod.LinkModelListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDefaultsModelsDefaultLinkModelMod {
  
  @JSImport("storm-react-diagrams/dist/src/defaults/models/DefaultLinkModel", "DefaultLinkModel")
  @js.native
  open class DefaultLinkModel () extends LinkModel[DefaultLinkModelListener] {
    def this(`type`: String) = this()
    
    def addLabel(label: String): Unit = js.native
    
    var color: String = js.native
    
    var curvyness: Double = js.native
    
    def setColor(color: String): Unit = js.native
    
    def setWidth(width: Double): Unit = js.native
    
    var width: Double = js.native
  }
  
  trait DefaultLinkModelListener
    extends StObject
       with LinkModelListener {
    
    var colorChanged: js.UndefOr[js.Function1[/* event */ BaseEventDefaultLinkModel, Unit]] = js.undefined
    
    var widthChanged: js.UndefOr[js.Function1[/* event */ BaseEventDefaultLinkModelEntity, Unit]] = js.undefined
  }
  object DefaultLinkModelListener {
    
    inline def apply(): DefaultLinkModelListener = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultLinkModelListener]
    }
    
    extension [Self <: DefaultLinkModelListener](x: Self) {
      
      inline def setColorChanged(value: /* event */ BaseEventDefaultLinkModel => Callback): Self = StObject.set(x, "colorChanged", js.Any.fromFunction1((t0: /* event */ BaseEventDefaultLinkModel) => value(t0).runNow()))
      
      inline def setColorChangedUndefined: Self = StObject.set(x, "colorChanged", js.undefined)
      
      inline def setWidthChanged(value: /* event */ BaseEventDefaultLinkModelEntity => Callback): Self = StObject.set(x, "widthChanged", js.Any.fromFunction1((t0: /* event */ BaseEventDefaultLinkModelEntity) => value(t0).runNow()))
      
      inline def setWidthChangedUndefined: Self = StObject.set(x, "widthChanged", js.undefined)
    }
  }
}
