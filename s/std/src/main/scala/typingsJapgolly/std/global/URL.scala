package typingsJapgolly.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("URL")
@js.native
open class URL protected ()
  extends StObject
     with typingsJapgolly.std.URL {
  /* standard dom */
  def this(url: java.lang.String) = this()
  def this(url: org.scalajs.dom.URL) = this()
  def this(url: java.lang.String, base: java.lang.String) = this()
  def this(url: java.lang.String, base: org.scalajs.dom.URL) = this()
  def this(url: org.scalajs.dom.URL, base: java.lang.String) = this()
  def this(url: org.scalajs.dom.URL, base: org.scalajs.dom.URL) = this()
  
  /* standard dom */
  /* CompleteClass */
  var hash: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var host: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var hostname: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var href: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val origin: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var password: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var pathname: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var port: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var protocol: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var search: java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val searchParams: typingsJapgolly.std.URLSearchParams = js.native
  
  /* standard dom */
  /* CompleteClass */
  override def toJSON(): java.lang.String = js.native
  
  /* standard dom */
  /* CompleteClass */
  var username: java.lang.String = js.native
}
object URL {
  
  @JSGlobal("URL")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard dom */
  inline def createObjectURL(obj: org.scalajs.dom.Blob): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectURL")(obj.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  inline def createObjectURL(obj: typingsJapgolly.std.MediaSource): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectURL")(obj.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /* standard dom */
  inline def revokeObjectURL(url: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revokeObjectURL")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
