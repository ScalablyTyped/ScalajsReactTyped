package typingsJapgolly.angularDevkitCore.anon

import typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.delete
import typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.exists
import typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.isDirectory
import typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.isFile
import typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.list
import typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.read
import typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.stat
import typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.watch
import typingsJapgolly.angularDevkitCore.angularDevkitCoreStrings.write
import typingsJapgolly.angularDevkitCore.srcVirtualFsHostTestMod.test.TestLogRecord
import typingsJapgolly.angularDevkitCore.srcVirtualFsPathMod.Path_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kind
  extends StObject
     with TestLogRecord {
  
  var kind: write | read | delete | list | exists | isDirectory | isFile | stat | watch
  
  var path: Path_
}
object Kind {
  
  inline def apply(kind: write | read | delete | list | exists | isDirectory | isFile | stat | watch, path: Path_): Kind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kind]
  }
  
  extension [Self <: Kind](x: Self) {
    
    inline def setKind(value: write | read | delete | list | exists | isDirectory | isFile | stat | watch): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Path_): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
