package typingsJapgolly.std.global

import org.scalajs.dom.Document
import typingsJapgolly.std.IntersectionObserverCallback
import typingsJapgolly.std.IntersectionObserverInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("IntersectionObserver")
@js.native
open class IntersectionObserver protected ()
  extends StObject
     with typingsJapgolly.std.IntersectionObserver {
  /* standard dom */
  def this(callback: IntersectionObserverCallback) = this()
  def this(callback: IntersectionObserverCallback, options: IntersectionObserverInit) = this()
  
  /* standard dom */
  /* CompleteClass */
  override def disconnect(): Unit = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def observe(target: org.scalajs.dom.Element): Unit = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val root: org.scalajs.dom.Element | Document | Null = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val rootMargin: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def takeRecords(): js.Array[typingsJapgolly.std.IntersectionObserverEntry] = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val thresholds: js.Array[Double] = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def unobserve(target: org.scalajs.dom.Element): Unit = js.native
}
