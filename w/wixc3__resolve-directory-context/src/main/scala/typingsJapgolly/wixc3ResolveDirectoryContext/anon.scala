package typingsJapgolly.wixc3ResolveDirectoryContext

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixc3ResolveDirectoryContext.wixc3ResolveDirectoryContextBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IsDirectory extends StObject {
    
    def isDirectory(): Boolean
    
    def isFile(): Boolean
    
    var name: String
  }
  object IsDirectory {
    
    inline def apply(isDirectory: CallbackTo[Boolean], isFile: CallbackTo[Boolean], name: String): IsDirectory = {
      val __obj = js.Dynamic.literal(isDirectory = isDirectory.toJsFn, isFile = isFile.toJsFn, name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsDirectory]
    }
    
    extension [Self <: IsDirectory](x: Self) {
      
      inline def setIsDirectory(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDirectory", value.toJsFn)
      
      inline def setIsFile(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFile", value.toJsFn)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsFile extends StObject {
    
    def isFile(): Boolean
  }
  object IsFile {
    
    inline def apply(isFile: CallbackTo[Boolean]): IsFile = {
      val __obj = js.Dynamic.literal(isFile = isFile.toJsFn)
      __obj.asInstanceOf[IsFile]
    }
    
    extension [Self <: IsFile](x: Self) {
      
      inline def setIsFile(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFile", value.toJsFn)
    }
  }
  
  trait WithFileTypes extends StObject {
    
    var withFileTypes: `true`
  }
  object WithFileTypes {
    
    inline def apply(): WithFileTypes = {
      val __obj = js.Dynamic.literal(withFileTypes = true)
      __obj.asInstanceOf[WithFileTypes]
    }
    
    extension [Self <: WithFileTypes](x: Self) {
      
      inline def setWithFileTypes(value: `true`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    }
  }
}
