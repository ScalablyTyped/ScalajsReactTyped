package typingsJapgolly.nginstackWebFramework

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMessagingMasterComponentMod {
  
  inline def apply(parent: typingsJapgolly.nginstackWebFramework.libMessagingComponentMod.^): Unit = ^.asInstanceOf[js.Dynamic].apply(parent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(parent: typingsJapgolly.nginstackWebFramework.libMessagingComponentMod.^, opt_props: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(parent.asInstanceOf[js.Any], opt_props.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/messaging/MasterComponent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with MasterComponent {
    def this(parent: typingsJapgolly.nginstackWebFramework.libMessagingComponentMod.^) = this()
    def this(parent: typingsJapgolly.nginstackWebFramework.libMessagingComponentMod.^, opt_props: Any) = this()
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var pairId_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var pairName_ : Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/messaging/MasterComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait MasterComponent extends StObject {
    
    def dispose(): Unit
    
    /* private */ var pairId_ : Any
    
    /* private */ var pairName_ : Any
  }
  object MasterComponent {
    
    inline def apply(dispose: Callback, pairId_ : Any, pairName_ : Any): MasterComponent = {
      val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, pairId_ = pairId_.asInstanceOf[js.Any], pairName_ = pairName_.asInstanceOf[js.Any])
      __obj.asInstanceOf[MasterComponent]
    }
    
    extension [Self <: MasterComponent](x: Self) {
      
      inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
      
      inline def setPairId_(value: Any): Self = StObject.set(x, "pairId_", value.asInstanceOf[js.Any])
      
      inline def setPairName_(value: Any): Self = StObject.set(x, "pairName_", value.asInstanceOf[js.Any])
    }
  }
}
