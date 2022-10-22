package typingsJapgolly.focusWithin

import org.scalajs.dom.HTMLDocument
import typingsJapgolly.focusWithin.mod.FocusWithinOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def focusWithin(document: HTMLDocument): Unit = js.Dynamic.global.applyDynamic("focusWithin")(document.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def focusWithin(document: HTMLDocument, opts: FocusWithinOpts): Unit = (js.Dynamic.global.applyDynamic("focusWithin")(document.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
