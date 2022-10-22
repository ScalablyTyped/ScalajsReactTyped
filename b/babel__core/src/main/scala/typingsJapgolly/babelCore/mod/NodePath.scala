package typingsJapgolly.babelCore.mod

import typingsJapgolly.babelTraverse.anon.Container
import typingsJapgolly.babelTraverse.mod.Hub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/core", "NodePath")
@js.native
open class NodePath[T] protected ()
  extends typingsJapgolly.babelTraverse.mod.NodePath[T] {
  def this(hub: Hub, parent: typingsJapgolly.babelTypes.mod.Node) = this()
}
/* static members */
object NodePath {
  
  @JSImport("@babel/core", "NodePath")
  @js.native
  val ^ : js.Any = js.native
  
  inline def get[C /* <: typingsJapgolly.babelTypes.mod.Node */, K /* <: /* keyof C */ String */](opts: Container[C, K]): typingsJapgolly.babelTraverse.mod.NodePath[
    /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(opts.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babelTraverse.mod.NodePath[
    /* import warning: importer.ImportType#apply Failed type conversion: C[K] */ js.Any
  ]]
}
