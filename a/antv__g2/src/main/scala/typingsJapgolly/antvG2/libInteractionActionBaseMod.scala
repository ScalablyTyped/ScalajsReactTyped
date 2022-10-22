package typingsJapgolly.antvG2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.antvG2.libInterfaceMod.IAction
import typingsJapgolly.antvG2.libInterfaceMod.IInteractionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionBaseMod {
  
  /**
    * Action 的基类
    */
  /* note: abstract class */ @JSImport("@antv/g2/lib/interaction/action/base", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with Action[T] {
    def this(context: IInteractionContext) = this()
    def this(context: IInteractionContext, cfg: T) = this()
    
    /**
      * 设置配置项传入的值
      * @param cfg
      */
    /* protected */ /* CompleteClass */
    override def applyCfg(cfg: Any): Unit = js.native
    
    /** Action 配置 */
    /* protected */ /* CompleteClass */
    var cfg: T = js.native
    
    /** 配置项的字段，自动负值到 this 上 */
    /* protected */ /* CompleteClass */
    var cfgFields: js.Array[String] = js.native
    
    /**
      * 上下文
      */
    /* CompleteClass */
    var context: IInteractionContext = js.native
    
    /**
      * 销毁函数
      */
    /* CompleteClass */
    override def destroy(): Any = js.native
    
    /**
      * 初始化
      */
    /* CompleteClass */
    override def init(): Any = js.native
    
    /**
      * 交互 action (反馈)的名称
      */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /**
    * Action 的基类
    */
  trait Action[T]
    extends StObject
       with IAction {
    
    /**
      * 设置配置项传入的值
      * @param cfg
      */
    /* protected */ def applyCfg(cfg: Any): Unit
    
    /** Action 配置 */
    /* protected */ var cfg: T
    
    /** 配置项的字段，自动负值到 this 上 */
    /* protected */ var cfgFields: js.Array[String]
  }
  object Action {
    
    inline def apply[T](
      applyCfg: Any => Callback,
      cfg: T,
      cfgFields: js.Array[String],
      context: IInteractionContext,
      destroy: CallbackTo[Any],
      init: CallbackTo[Any],
      name: String
    ): Action[T] = {
      val __obj = js.Dynamic.literal(applyCfg = js.Any.fromFunction1((t0: Any) => applyCfg(t0).runNow()), cfg = cfg.asInstanceOf[js.Any], cfgFields = cfgFields.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], destroy = destroy.toJsFn, init = init.toJsFn, name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action[T]]
    }
    
    extension [Self <: Action[?], T](x: Self & Action[T]) {
      
      inline def setApplyCfg(value: Any => Callback): Self = StObject.set(x, "applyCfg", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setCfg(value: T): Self = StObject.set(x, "cfg", value.asInstanceOf[js.Any])
      
      inline def setCfgFields(value: js.Array[String]): Self = StObject.set(x, "cfgFields", value.asInstanceOf[js.Any])
      
      inline def setCfgFieldsVarargs(value: String*): Self = StObject.set(x, "cfgFields", js.Array(value*))
    }
  }
}
