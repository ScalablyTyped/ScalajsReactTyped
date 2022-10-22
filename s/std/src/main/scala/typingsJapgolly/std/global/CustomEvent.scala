package typingsJapgolly.std.global

import typingsJapgolly.std.CustomEventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("CustomEvent")
@js.native
open class CustomEvent[T] protected ()
  extends StObject
     with typingsJapgolly.std.CustomEvent[T] {
  /* standard dom */
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: CustomEventInit[T]) = this()
}
