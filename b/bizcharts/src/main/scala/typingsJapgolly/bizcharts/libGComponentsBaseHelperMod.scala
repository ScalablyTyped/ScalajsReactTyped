package typingsJapgolly.bizcharts

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGComponentsBaseHelperMod {
  
  @JSImport("bizcharts/lib/g-components/Base/Helper", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Helper {
    def this(shape: Any) = this()
    
    /* CompleteClass */
    var config: Record[String, Any] = js.native
    
    /* CompleteClass */
    override def createInstance(props: Any): Unit = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    var instance: Any = js.native
    
    /* private */ /* CompleteClass */
    var shape: Any = js.native
    
    /* CompleteClass */
    override def update(props: Any): Unit = js.native
  }
  
  trait Helper extends StObject {
    
    var config: Record[String, Any]
    
    def createInstance(props: Any): Unit
    
    def destroy(): Unit
    
    var instance: Any
    
    /* private */ var shape: Any
    
    def update(props: Any): Unit
  }
  object Helper {
    
    inline def apply(
      config: Record[String, Any],
      createInstance: Any => Callback,
      destroy: Callback,
      instance: Any,
      shape: Any,
      update: Any => Callback
    ): Helper = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], createInstance = js.Any.fromFunction1((t0: Any) => createInstance(t0).runNow()), destroy = destroy.toJsFn, instance = instance.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], update = js.Any.fromFunction1((t0: Any) => update(t0).runNow()))
      __obj.asInstanceOf[Helper]
    }
    
    extension [Self <: Helper](x: Self) {
      
      inline def setConfig(value: Record[String, Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setCreateInstance(value: Any => Callback): Self = StObject.set(x, "createInstance", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setShape(value: Any): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: Any => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    }
  }
  
  trait IBaseProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var animate: js.UndefOr[typingsJapgolly.bizcharts.anon.Callback] = js.undefined
    
    var isClipShape: js.UndefOr[Boolean] = js.undefined
    
    var matrix: js.UndefOr[js.Array[Double]] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object IBaseProps {
    
    inline def apply(): IBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBaseProps]
    }
    
    extension [Self <: IBaseProps](x: Self) {
      
      inline def setAnimate(value: typingsJapgolly.bizcharts.anon.Callback): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setIsClipShape(value: Boolean): Self = StObject.set(x, "isClipShape", value.asInstanceOf[js.Any])
      
      inline def setIsClipShapeUndefined: Self = StObject.set(x, "isClipShape", js.undefined)
      
      inline def setMatrix(value: js.Array[Double]): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
      
      inline def setMatrixVarargs(value: Double*): Self = StObject.set(x, "matrix", js.Array(value*))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
