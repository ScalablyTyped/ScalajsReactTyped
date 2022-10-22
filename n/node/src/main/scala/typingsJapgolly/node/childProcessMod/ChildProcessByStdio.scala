package typingsJapgolly.node.childProcessMod

import typingsJapgolly.node.nodeColonstreamMod.Readable
import typingsJapgolly.node.nodeColonstreamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// return this object when stdio option is a tuple of 3
@js.native
trait ChildProcessByStdio[I /* <: Null | Writable */, O /* <: Null | Readable */, E /* <: Null | Readable */] extends StObject {
  
  var stderr: E = js.native
  
  var stdin: I = js.native
  
  val stdio: js.Tuple5[
    I, 
    O, 
    E, 
    js.UndefOr[Readable | Writable | Null], 
    js.UndefOr[(// extra, no modification
  Readable) | Writable | Null]
  ] = js.native
  
  var stdout: O = js.native
}
