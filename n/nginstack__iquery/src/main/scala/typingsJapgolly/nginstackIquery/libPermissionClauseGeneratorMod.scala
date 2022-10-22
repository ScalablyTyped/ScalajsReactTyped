package typingsJapgolly.nginstackIquery

import japgolly.scalajs.react.Callback
import typingsJapgolly.nginstackIquery.anon.DisableGetChildren
import typingsJapgolly.nginstackIquery.anon.Field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPermissionClauseGeneratorMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/iquery/lib/PermissionClauseGenerator", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PermissionClauseGenerator {
    
    /* CompleteClass */
    override def addClassPermission(classKey: Any, userKey: Any): Unit = js.native
    
    /* private */ /* CompleteClass */
    var classDefManager_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var classesWithoutExtrafilter_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var extrafilterClassMap_ : Any = js.native
    
    /* CompleteClass */
    override def generate(classFieldName: Any): String | (js.Array[(js.Array[String | DisableGetChildren]) | DisableGetChildren | Field | String]) | Field = js.native
    
    /* private */ /* CompleteClass */
    var iGroupUser_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var insertClassPermission_ : Any = js.native
  }
  @JSImport("@nginstack/iquery/lib/PermissionClauseGenerator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PermissionClauseGenerator extends StObject {
    
    def addClassPermission(classKey: Any, userKey: Any): Unit
    
    /* private */ var classDefManager_ : Any
    
    /* private */ var classesWithoutExtrafilter_ : Any
    
    /* private */ var extrafilterClassMap_ : Any
    
    def generate(classFieldName: Any): String | (js.Array[(js.Array[String | DisableGetChildren]) | DisableGetChildren | Field | String]) | Field
    
    /* private */ var iGroupUser_ : Any
    
    /* private */ var insertClassPermission_ : Any
  }
  object PermissionClauseGenerator {
    
    inline def apply(
      addClassPermission: (Any, Any) => Callback,
      classDefManager_ : Any,
      classesWithoutExtrafilter_ : Any,
      extrafilterClassMap_ : Any,
      generate: Any => String | (js.Array[(js.Array[String | DisableGetChildren]) | DisableGetChildren | Field | String]) | Field,
      iGroupUser_ : Any,
      insertClassPermission_ : Any
    ): PermissionClauseGenerator = {
      val __obj = js.Dynamic.literal(addClassPermission = js.Any.fromFunction2((t0: Any, t1: Any) => (addClassPermission(t0, t1)).runNow()), classDefManager_ = classDefManager_.asInstanceOf[js.Any], classesWithoutExtrafilter_ = classesWithoutExtrafilter_.asInstanceOf[js.Any], extrafilterClassMap_ = extrafilterClassMap_.asInstanceOf[js.Any], generate = js.Any.fromFunction1(generate), iGroupUser_ = iGroupUser_.asInstanceOf[js.Any], insertClassPermission_ = insertClassPermission_.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionClauseGenerator]
    }
    
    extension [Self <: PermissionClauseGenerator](x: Self) {
      
      inline def setAddClassPermission(value: (Any, Any) => Callback): Self = StObject.set(x, "addClassPermission", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setClassDefManager_(value: Any): Self = StObject.set(x, "classDefManager_", value.asInstanceOf[js.Any])
      
      inline def setClassesWithoutExtrafilter_(value: Any): Self = StObject.set(x, "classesWithoutExtrafilter_", value.asInstanceOf[js.Any])
      
      inline def setExtrafilterClassMap_(value: Any): Self = StObject.set(x, "extrafilterClassMap_", value.asInstanceOf[js.Any])
      
      inline def setGenerate(
        value: Any => String | (js.Array[(js.Array[String | DisableGetChildren]) | DisableGetChildren | Field | String]) | Field
      ): Self = StObject.set(x, "generate", js.Any.fromFunction1(value))
      
      inline def setIGroupUser_(value: Any): Self = StObject.set(x, "iGroupUser_", value.asInstanceOf[js.Any])
      
      inline def setInsertClassPermission_(value: Any): Self = StObject.set(x, "insertClassPermission_", value.asInstanceOf[js.Any])
    }
  }
}
