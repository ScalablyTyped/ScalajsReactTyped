package typingsJapgolly.codemirror.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocConstructor
  extends Instantiable1[/* text */ String, Doc]
     with Instantiable2[/* text */ String, /* mode */ js.Any, Doc]
     with Instantiable3[/* text */ String, /* mode */ js.Any, /* firstLineNumber */ Double, Doc]
     with Instantiable4[
      /* text */ String, 
      /* mode */ js.Any, 
      /* firstLineNumber */ Double, 
      /* lineSep */ String, 
      Doc
    ] {
  def apply(text: String): Doc = js.native
  def apply(text: String, mode: js.Any): Doc = js.native
  def apply(text: String, mode: js.Any, firstLineNumber: Double): Doc = js.native
  def apply(text: String, mode: js.Any, firstLineNumber: Double, lineSep: String): Doc = js.native
}

