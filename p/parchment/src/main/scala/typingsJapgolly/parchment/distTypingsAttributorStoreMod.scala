package typingsJapgolly.parchment

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.parchment.distTypingsBlotAbstractBlotMod.Formattable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsAttributorStoreMod {
  
  @JSImport("parchment/dist/typings/attributor/store", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AttributorStore {
    def this(domNode: HTMLElement) = this()
    
    /* CompleteClass */
    override def attribute(attribute: typingsJapgolly.parchment.distTypingsAttributorAttributorMod.default, value: Any): Unit = js.native
    
    /* private */ /* CompleteClass */
    var attributes: Any = js.native
    
    /* CompleteClass */
    override def build(): Unit = js.native
    
    /* CompleteClass */
    override def copy(target: Formattable): Unit = js.native
    
    /* private */ /* CompleteClass */
    var domNode: Any = js.native
    
    /* CompleteClass */
    override def move(target: Formattable): Unit = js.native
    
    /* CompleteClass */
    override def values(): StringDictionary[Any] = js.native
  }
  
  trait AttributorStore extends StObject {
    
    def attribute(attribute: typingsJapgolly.parchment.distTypingsAttributorAttributorMod.default, value: Any): Unit
    
    /* private */ var attributes: Any
    
    def build(): Unit
    
    def copy(target: Formattable): Unit
    
    /* private */ var domNode: Any
    
    def move(target: Formattable): Unit
    
    def values(): StringDictionary[Any]
  }
  object AttributorStore {
    
    inline def apply(
      attribute: (typingsJapgolly.parchment.distTypingsAttributorAttributorMod.default, Any) => Callback,
      attributes: Any,
      build: Callback,
      copy: Formattable => Callback,
      domNode: Any,
      move: Formattable => Callback,
      values: CallbackTo[StringDictionary[Any]]
    ): AttributorStore = {
      val __obj = js.Dynamic.literal(attribute = js.Any.fromFunction2((t0: typingsJapgolly.parchment.distTypingsAttributorAttributorMod.default, t1: Any) => (attribute(t0, t1)).runNow()), attributes = attributes.asInstanceOf[js.Any], build = build.toJsFn, copy = js.Any.fromFunction1((t0: Formattable) => copy(t0).runNow()), domNode = domNode.asInstanceOf[js.Any], move = js.Any.fromFunction1((t0: Formattable) => move(t0).runNow()), values = values.toJsFn)
      __obj.asInstanceOf[AttributorStore]
    }
    
    extension [Self <: AttributorStore](x: Self) {
      
      inline def setAttribute(value: (typingsJapgolly.parchment.distTypingsAttributorAttributorMod.default, Any) => Callback): Self = StObject.set(x, "attribute", js.Any.fromFunction2((t0: typingsJapgolly.parchment.distTypingsAttributorAttributorMod.default, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setBuild(value: Callback): Self = StObject.set(x, "build", value.toJsFn)
      
      inline def setCopy(value: Formattable => Callback): Self = StObject.set(x, "copy", js.Any.fromFunction1((t0: Formattable) => value(t0).runNow()))
      
      inline def setDomNode(value: Any): Self = StObject.set(x, "domNode", value.asInstanceOf[js.Any])
      
      inline def setMove(value: Formattable => Callback): Self = StObject.set(x, "move", js.Any.fromFunction1((t0: Formattable) => value(t0).runNow()))
      
      inline def setValues(value: CallbackTo[StringDictionary[Any]]): Self = StObject.set(x, "values", value.toJsFn)
    }
  }
}
