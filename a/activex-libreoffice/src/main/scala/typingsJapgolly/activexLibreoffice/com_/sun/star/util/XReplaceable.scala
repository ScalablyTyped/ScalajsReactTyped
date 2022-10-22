package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to replace strings in a text described by a {@link SearchDescriptor} .
  *
  * Example: replace all bold words "search for" by "look for"
  *
  * {{program example here, see documentation}}
  */
trait XReplaceable
  extends StObject
     with XSearchable {
  
  /**
    * creates a descriptor which contains properties that specify a search in this container.
    * @see SearchDescriptor
    */
  def createReplaceDescriptor(): XReplaceDescriptor
  
  /**
    * searches for all occurrences of whatever is specified.
    * @see SearchDescriptor
    */
  def replaceAll(xDesc: XSearchDescriptor): Double
}
object XReplaceable {
  
  inline def apply(
    acquire: Callback,
    createReplaceDescriptor: CallbackTo[XReplaceDescriptor],
    createSearchDescriptor: CallbackTo[XSearchDescriptor],
    findAll: XSearchDescriptor => XIndexAccess,
    findFirst: XSearchDescriptor => XInterface,
    findNext: (XInterface, XSearchDescriptor) => XInterface,
    queryInterface: `type` => Any,
    release: Callback,
    replaceAll: XSearchDescriptor => Double
  ): XReplaceable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createReplaceDescriptor = createReplaceDescriptor.toJsFn, createSearchDescriptor = createSearchDescriptor.toJsFn, findAll = js.Any.fromFunction1(findAll), findFirst = js.Any.fromFunction1(findFirst), findNext = js.Any.fromFunction2(findNext), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, replaceAll = js.Any.fromFunction1(replaceAll))
    __obj.asInstanceOf[XReplaceable]
  }
  
  extension [Self <: XReplaceable](x: Self) {
    
    inline def setCreateReplaceDescriptor(value: CallbackTo[XReplaceDescriptor]): Self = StObject.set(x, "createReplaceDescriptor", value.toJsFn)
    
    inline def setReplaceAll(value: XSearchDescriptor => Double): Self = StObject.set(x, "replaceAll", js.Any.fromFunction1(value))
  }
}
