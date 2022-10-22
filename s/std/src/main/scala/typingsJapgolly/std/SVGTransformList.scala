package typingsJapgolly.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The SVGTransformList defines a list of SVGTransform objects. */
@js.native
trait SVGTransformList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[org.scalajs.dom.SVGTransform] {
  
  /* standard dom */
  def appendItem(newItem: org.scalajs.dom.SVGTransform): org.scalajs.dom.SVGTransform = js.native
  
  /* standard dom */
  def clear(): Unit = js.native
  
  /* standard dom */
  def consolidate(): org.scalajs.dom.SVGTransform | Null = js.native
  
  /* standard dom */
  def createSVGTransformFromMatrix(): org.scalajs.dom.SVGTransform = js.native
  def createSVGTransformFromMatrix(matrix: DOMMatrix2DInit): org.scalajs.dom.SVGTransform = js.native
  
  /* standard dom */
  def getItem(index: Double): org.scalajs.dom.SVGTransform = js.native
  
  /* standard dom */
  def initialize(newItem: org.scalajs.dom.SVGTransform): org.scalajs.dom.SVGTransform = js.native
  
  /* standard dom */
  def insertItemBefore(newItem: org.scalajs.dom.SVGTransform, index: Double): org.scalajs.dom.SVGTransform = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.SVGTransform]] = js.native
  
  /* standard dom */
  val length: Double = js.native
  
  /* standard dom */
  val numberOfItems: Double = js.native
  
  /* standard dom */
  def removeItem(index: Double): org.scalajs.dom.SVGTransform = js.native
  
  /* standard dom */
  def replaceItem(newItem: org.scalajs.dom.SVGTransform, index: Double): org.scalajs.dom.SVGTransform = js.native
}
