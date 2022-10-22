package typingsJapgolly.node

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.node.anon.DeepEqual
import typingsJapgolly.node.nodeStrings.deepEqual
import typingsJapgolly.node.nodeStrings.deepStrictEqual
import typingsJapgolly.node.nodeStrings.equal
import typingsJapgolly.node.nodeStrings.ifError
import typingsJapgolly.node.nodeStrings.notDeepEqual
import typingsJapgolly.node.nodeStrings.notEqual
import typingsJapgolly.node.nodeStrings.ok
import typingsJapgolly.node.nodeStrings.strict
import typingsJapgolly.node.nodeStrings.strictEqual
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object assertStrictMod extends Shortcut {
  
  @JSImport("assert/strict", JSImport.Namespace)
  @js.native
  val ^ : (Omit[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof assert */ Any, 
    equal | notEqual | deepEqual | notDeepEqual | ok | strictEqual | deepStrictEqual | ifError | strict
  ]) & DeepEqual = js.native
  
  type _To = (Omit[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof assert */ Any, 
    equal | notEqual | deepEqual | notDeepEqual | ok | strictEqual | deepStrictEqual | ifError | strict
  ]) & DeepEqual
  
  /* This means you don't have to write `^`, but can instead just say `assertStrictMod.foo` */
  override def _to: (Omit[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof assert */ Any, 
    equal | notEqual | deepEqual | notDeepEqual | ok | strictEqual | deepStrictEqual | ifError | strict
  ]) & DeepEqual = ^
}
