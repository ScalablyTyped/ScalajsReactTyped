package typingsJapgolly.std.global

import typingsJapgolly.std.DOMPointInit
import typingsJapgolly.std.DOMQuadInit
import typingsJapgolly.std.DOMRectInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DOMQuad")
@js.native
/* standard dom */
open class DOMQuad ()
  extends StObject
     with typingsJapgolly.std.DOMQuad {
  def this(p1: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit) = this()
  def this(p1: Unit, p2: Unit, p3: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit, p3: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: Unit, p3: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit) = this()
  def this(p1: Unit, p2: Unit, p3: Unit, p4: DOMPointInit) = this()
  def this(p1: Unit, p2: Unit, p3: DOMPointInit, p4: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit, p3: Unit, p4: DOMPointInit) = this()
  def this(p1: Unit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: Unit, p3: Unit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: Unit, p3: DOMPointInit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: Unit, p4: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
  
  /* standard dom */
  /* CompleteClass */
  override def getBounds(): org.scalajs.dom.DOMRect = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val p1: typingsJapgolly.std.DOMPoint = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val p2: typingsJapgolly.std.DOMPoint = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val p3: typingsJapgolly.std.DOMPoint = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val p4: typingsJapgolly.std.DOMPoint = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
object DOMQuad {
  
  @JSGlobal("DOMQuad")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard dom */
  inline def fromQuad(): typingsJapgolly.std.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQuad")().asInstanceOf[typingsJapgolly.std.DOMQuad]
  inline def fromQuad(other: DOMQuadInit): typingsJapgolly.std.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQuad")(other.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.std.DOMQuad]
  
  /* standard dom */
  inline def fromRect(): typingsJapgolly.std.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")().asInstanceOf[typingsJapgolly.std.DOMQuad]
  inline def fromRect(other: DOMRectInit): typingsJapgolly.std.DOMQuad = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")(other.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.std.DOMQuad]
}
