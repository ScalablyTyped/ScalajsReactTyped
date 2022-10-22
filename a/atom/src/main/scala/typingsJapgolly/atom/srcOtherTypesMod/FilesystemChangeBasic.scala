package typingsJapgolly.atom.srcOtherTypesMod

import typingsJapgolly.atom.atomStrings.created
import typingsJapgolly.atom.atomStrings.deleted
import typingsJapgolly.atom.atomStrings.modified
import typingsJapgolly.atom.atomStrings.renamed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilesystemChangeBasic[Action /* <: created | modified | deleted | renamed */] extends StObject {
  
  /** A string describing the filesystem action that occurred. */
  var action: Action
  
  /** The absolute path to the filesystem entry that was acted upon. */
  var path: String
}
object FilesystemChangeBasic {
  
  inline def apply[Action /* <: created | modified | deleted | renamed */](action: Action, path: String): FilesystemChangeBasic[Action] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesystemChangeBasic[Action]]
  }
  
  extension [Self <: FilesystemChangeBasic[?], Action /* <: created | modified | deleted | renamed */](x: Self & FilesystemChangeBasic[Action]) {
    
    inline def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
