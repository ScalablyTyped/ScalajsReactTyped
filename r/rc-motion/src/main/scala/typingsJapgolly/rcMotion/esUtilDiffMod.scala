package typingsJapgolly.rcMotion

import typingsJapgolly.rcMotion.anon.Status
import typingsJapgolly.rcMotion.rcMotionStrings.add
import typingsJapgolly.rcMotion.rcMotionStrings.keep
import typingsJapgolly.rcMotion.rcMotionStrings.remove
import typingsJapgolly.rcMotion.rcMotionStrings.removed
import typingsJapgolly.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilDiffMod {
  
  @JSImport("rc-motion/es/util/diff", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-motion/es/util/diff", "STATUS_ADD")
  @js.native
  val STATUS_ADD: add = js.native
  
  @JSImport("rc-motion/es/util/diff", "STATUS_KEEP")
  @js.native
  val STATUS_KEEP: keep = js.native
  
  @JSImport("rc-motion/es/util/diff", "STATUS_REMOVE")
  @js.native
  val STATUS_REMOVE: remove = js.native
  
  @JSImport("rc-motion/es/util/diff", "STATUS_REMOVED")
  @js.native
  val STATUS_REMOVED: removed = js.native
  
  inline def diffKeys(): js.Array[KeyObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("diffKeys")().asInstanceOf[js.Array[KeyObject]]
  inline def diffKeys(prevKeys: js.Array[KeyObject]): js.Array[KeyObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("diffKeys")(prevKeys.asInstanceOf[js.Any]).asInstanceOf[js.Array[KeyObject]]
  inline def diffKeys(prevKeys: js.Array[KeyObject], currentKeys: js.Array[KeyObject]): js.Array[KeyObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffKeys")(prevKeys.asInstanceOf[js.Any], currentKeys.asInstanceOf[js.Any])).asInstanceOf[js.Array[KeyObject]]
  inline def diffKeys(prevKeys: Unit, currentKeys: js.Array[KeyObject]): js.Array[KeyObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("diffKeys")(prevKeys.asInstanceOf[js.Any], currentKeys.asInstanceOf[js.Any])).asInstanceOf[js.Array[KeyObject]]
  
  inline def parseKeys(): js.Array[Status] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKeys")().asInstanceOf[js.Array[Status]]
  inline def parseKeys(keys: js.Array[Any]): js.Array[Status] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKeys")(keys.asInstanceOf[js.Any]).asInstanceOf[js.Array[Status]]
  
  inline def wrapKeyToObject(key: Key): Status = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapKeyToObject")(key.asInstanceOf[js.Any]).asInstanceOf[Status]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rcMotion.rcMotionStrings.add
    - typingsJapgolly.rcMotion.rcMotionStrings.keep
    - typingsJapgolly.rcMotion.rcMotionStrings.remove
    - typingsJapgolly.rcMotion.rcMotionStrings.removed
  */
  trait DiffStatus extends StObject
  object DiffStatus {
    
    inline def add: typingsJapgolly.rcMotion.rcMotionStrings.add = "add".asInstanceOf[typingsJapgolly.rcMotion.rcMotionStrings.add]
    
    inline def keep: typingsJapgolly.rcMotion.rcMotionStrings.keep = "keep".asInstanceOf[typingsJapgolly.rcMotion.rcMotionStrings.keep]
    
    inline def remove: typingsJapgolly.rcMotion.rcMotionStrings.remove = "remove".asInstanceOf[typingsJapgolly.rcMotion.rcMotionStrings.remove]
    
    inline def removed: typingsJapgolly.rcMotion.rcMotionStrings.removed = "removed".asInstanceOf[typingsJapgolly.rcMotion.rcMotionStrings.removed]
  }
  
  trait KeyObject extends StObject {
    
    var key: Key
    
    var status: js.UndefOr[DiffStatus] = js.undefined
  }
  object KeyObject {
    
    inline def apply(key: Key): KeyObject = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyObject]
    }
    
    extension [Self <: KeyObject](x: Self) {
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: DiffStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
