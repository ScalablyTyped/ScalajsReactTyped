package typingsJapgolly.forms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FieldIterator = js.Function2[
    /* name */ java.lang.String, 
    /* field */ typingsJapgolly.forms.mod.FieldBound, 
    java.lang.String
  ]
  type FormHandleCallback = js.Function1[/* form */ typingsJapgolly.forms.mod.Form, scala.Unit]
  type RenderFunction = js.Function2[
    /* name */ java.lang.String, 
    /* field */ typingsJapgolly.forms.mod.Field, 
    java.lang.String
  ]
  type ValidatorFunction = js.Function3[
    /* form */ typingsJapgolly.forms.mod.FormBound, 
    /* field */ typingsJapgolly.forms.mod.FieldBound, 
    /* callback */ js.Function1[/* err */ js.UndefOr[java.lang.String], scala.Unit], 
    scala.Unit
  ]
}
