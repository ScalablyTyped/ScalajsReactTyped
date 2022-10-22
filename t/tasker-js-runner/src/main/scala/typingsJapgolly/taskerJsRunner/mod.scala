package typingsJapgolly.taskerJsRunner

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tasker-js-runner", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TaskerJs {
    def this(routes: StringDictionary[TaskerJsModule]) = this()
    
    /* CompleteClass */
    override def hotReload(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    var router: StringDictionary[TaskerJsModule] = js.native
  }
  
  trait TaskerJs extends StObject {
    
    def hotReload(): js.Promise[Unit]
    
    var router: StringDictionary[TaskerJsModule]
  }
  object TaskerJs {
    
    inline def apply(hotReload: CallbackTo[js.Promise[Unit]], router: StringDictionary[TaskerJsModule]): TaskerJs = {
      val __obj = js.Dynamic.literal(hotReload = hotReload.toJsFn, router = router.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskerJs]
    }
    
    extension [Self <: TaskerJs](x: Self) {
      
      inline def setHotReload(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "hotReload", value.toJsFn)
      
      inline def setRouter(value: StringDictionary[TaskerJsModule]): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    }
  }
  
  trait TaskerJsModule extends StObject {
    
    def enter(
      locals: StringDictionary[String],
      tasker: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tasker */ Any
    ): Unit
    
    def exit(
      locals: StringDictionary[String],
      tasker: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tasker */ Any
    ): Unit
  }
  object TaskerJsModule {
    
    inline def apply(
      enter: (StringDictionary[String], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tasker */ Any) => Callback,
      exit: (StringDictionary[String], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tasker */ Any) => Callback
    ): TaskerJsModule = {
      val __obj = js.Dynamic.literal(enter = js.Any.fromFunction2((t0: StringDictionary[String], t1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tasker */ Any) => (enter(t0, t1)).runNow()), exit = js.Any.fromFunction2((t0: StringDictionary[String], t1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tasker */ Any) => (exit(t0, t1)).runNow()))
      __obj.asInstanceOf[TaskerJsModule]
    }
    
    extension [Self <: TaskerJsModule](x: Self) {
      
      inline def setEnter(
        value: (StringDictionary[String], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tasker */ Any) => Callback
      ): Self = StObject.set(x, "enter", js.Any.fromFunction2((t0: StringDictionary[String], t1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tasker */ Any) => (value(t0, t1)).runNow()))
      
      inline def setExit(
        value: (StringDictionary[String], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tasker */ Any) => Callback
      ): Self = StObject.set(x, "exit", js.Any.fromFunction2((t0: StringDictionary[String], t1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify tasker */ Any) => (value(t0, t1)).runNow()))
    }
  }
}
