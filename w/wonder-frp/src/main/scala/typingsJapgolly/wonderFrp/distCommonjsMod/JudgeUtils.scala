package typingsJapgolly.wonderFrp.distCommonjsMod

import typingsJapgolly.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/commonjs", "JudgeUtils")
@js.native
open class JudgeUtils ()
  extends typingsJapgolly.wonderFrp.distCommonjsJudgeUtilsMod.JudgeUtils
/* static members */
object JudgeUtils {
  
  @JSImport("wonder-frp/dist/commonjs", "JudgeUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isEqual(
    ob1: typingsJapgolly.wonderFrp.distCommonjsCoreEntityMod.Entity,
    ob2: typingsJapgolly.wonderFrp.distCommonjsCoreEntityMod.Entity
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(ob1.asInstanceOf[js.Any], ob2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isIObserver(i: IObserver): js.Function0[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("isIObserver")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Any]]
  
  inline def isPromise(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPromise")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
