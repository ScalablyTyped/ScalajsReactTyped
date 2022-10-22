package typingsJapgolly.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The SVGLengthList defines a list of SVGLength objects. */
@js.native
trait SVGLengthList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[org.scalajs.dom.SVGLength] {
  
  /* standard dom */
  def appendItem(newItem: org.scalajs.dom.SVGLength): org.scalajs.dom.SVGLength = js.native
  
  /* standard dom */
  def clear(): Unit = js.native
  
  /* standard dom */
  def getItem(index: Double): org.scalajs.dom.SVGLength = js.native
  
  /* standard dom */
  def initialize(newItem: org.scalajs.dom.SVGLength): org.scalajs.dom.SVGLength = js.native
  
  /* standard dom */
  def insertItemBefore(newItem: org.scalajs.dom.SVGLength, index: Double): org.scalajs.dom.SVGLength = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.SVGLength]] = js.native
  
  /* standard dom */
  val length: Double = js.native
  
  /* standard dom */
  val numberOfItems: Double = js.native
  
  /* standard dom */
  def removeItem(index: Double): org.scalajs.dom.SVGLength = js.native
  
  /* standard dom */
  def replaceItem(newItem: org.scalajs.dom.SVGLength, index: Double): org.scalajs.dom.SVGLength = js.native
}
