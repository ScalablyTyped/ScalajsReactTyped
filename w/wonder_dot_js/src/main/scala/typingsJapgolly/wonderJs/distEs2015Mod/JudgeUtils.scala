package typingsJapgolly.wonderJs.distEs2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "JudgeUtils")
@js.native
open class JudgeUtils ()
  extends typingsJapgolly.wonderJs.distEs2015UtilsJudgeUtilsMod.JudgeUtils
/* static members */
object JudgeUtils {
  
  @JSImport("wonder.js/dist/es2015", "JudgeUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isClass(objInstance: Any, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClass")(objInstance.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isCollection(
    list: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Collection<any> */ Any
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCollection")(list.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isComponenet(component: typingsJapgolly.wonderJs.distEs2015CoreComponentMod.Component): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComponenet")(component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDom(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDom")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEqual(target1: Any, target2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(target1.asInstanceOf[js.Any], target2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isFloatArray(data: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFloatArray")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInterface(target: Any, memberOfInterface: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInterface")(target.asInstanceOf[js.Any], memberOfInterface.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isPowerOfTwo(value: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPowerOfTwo")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSelf(
    self: typingsJapgolly.wonderJs.distEs2015CoreEntityMod.Entity,
    entityObject: typingsJapgolly.wonderJs.distEs2015CoreEntityMod.Entity
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSelf")(self.asInstanceOf[js.Any], entityObject.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isView(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isView")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
