package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.distEs2015CoreEntityMod.Entity
import typingsJapgolly.wonderFrp.distEs2015ObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015JudgeUtilsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JudgeUtils$ * / any */ @JSImport("wonder-frp/dist/es2015/JudgeUtils", "JudgeUtils")
  @js.native
  open class JudgeUtils () extends StObject
  /* static members */
  object JudgeUtils {
    
    @JSImport("wonder-frp/dist/es2015/JudgeUtils", "JudgeUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isEqual(ob1: Entity, ob2: Entity): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(ob1.asInstanceOf[js.Any], ob2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isIObserver(i: IObserver): js.Function0[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("isIObserver")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Any]]
    
    inline def isPromise(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
