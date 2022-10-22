package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A creator for new (persistent) contents, like file system folders.
  *
  * Creation of a new (persistent) content:  1. creatabletypes = creator.queryCreatableContentsInfo() 2. choose a suitable type from creatabletypes 3.
  * newObject = creator.createNewContent( type ) 4. initialize the new object (i.e. newObject.Property1 = ...) 5. let the new content execute the command
  * "insert". That command commits the data and makes the new content persistent.
  * @author Kai Sommerfeld
  * @deprecated Deprecated  This interface is deprecated. Use {@link Content} property "CreatableContentsInfo" and command "createNewContent" instead.
  * @see XContent
  * @see XCommandProcessor
  * @version 1.0
  */
trait XContentCreator
  extends StObject
     with XInterface {
  
  /**
    * creates a new content of given type.
    * @param Info the content information.
    * @returns the new content, if operation was successful.
    */
  def createNewContent(Info: ContentInfo): XContent
  
  /**
    * returns a list with information about the creatable contents.
    * @returns the list with information about the creatable contents.
    */
  def queryCreatableContentsInfo(): SafeArray[ContentInfo]
}
object XContentCreator {
  
  inline def apply(
    acquire: Callback,
    createNewContent: ContentInfo => XContent,
    queryCreatableContentsInfo: CallbackTo[SafeArray[ContentInfo]],
    queryInterface: `type` => Any,
    release: Callback
  ): XContentCreator = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createNewContent = js.Any.fromFunction1(createNewContent), queryCreatableContentsInfo = queryCreatableContentsInfo.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XContentCreator]
  }
  
  extension [Self <: XContentCreator](x: Self) {
    
    inline def setCreateNewContent(value: ContentInfo => XContent): Self = StObject.set(x, "createNewContent", js.Any.fromFunction1(value))
    
    inline def setQueryCreatableContentsInfo(value: CallbackTo[SafeArray[ContentInfo]]): Self = StObject.set(x, "queryCreatableContentsInfo", value.toJsFn)
  }
}
