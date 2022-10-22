package typingsJapgolly.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015UtilsArrayUtilsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ArrayUtils$ * / any */ @JSImport("wonder.js/dist/es2015/utils/ArrayUtils", "ArrayUtils")
  @js.native
  open class ArrayUtils () extends StObject
  /* static members */
  object ArrayUtils {
    
    @JSImport("wonder.js/dist/es2015/utils/ArrayUtils", "ArrayUtils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def contain(arr: js.Array[Any], item: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contain")(arr.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def hasRepeatItems(arr: js.Array[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasRepeatItems")(arr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
