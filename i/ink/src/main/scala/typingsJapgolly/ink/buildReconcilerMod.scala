package typingsJapgolly.ink

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ink.buildDomMod.DOMElement
import typingsJapgolly.ink.buildDomMod.TextNode
import typingsJapgolly.reactReconciler.mod.Reconciler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildReconcilerMod extends Shortcut {
  
  @JSImport("ink/build/reconciler", JSImport.Default)
  @js.native
  val default: Reconciler[DOMElement, DOMElement, TextNode, DOMElement, Any] = js.native
  
  type _To = Reconciler[DOMElement, DOMElement, TextNode, DOMElement, Any]
  
  /* This means you don't have to write `default`, but can instead just say `buildReconcilerMod.foo` */
  override def _to: Reconciler[DOMElement, DOMElement, TextNode, DOMElement, Any] = default
}
