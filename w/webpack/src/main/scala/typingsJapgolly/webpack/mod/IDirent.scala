package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDirent extends StObject {
  
  def isBlockDevice(): Boolean
  
  def isCharacterDevice(): Boolean
  
  def isDirectory(): Boolean
  
  def isFIFO(): Boolean
  
  def isFile(): Boolean
  
  def isSocket(): Boolean
  
  def isSymbolicLink(): Boolean
  
  var name: String | Buffer
}
object IDirent {
  
  inline def apply(
    isBlockDevice: CallbackTo[Boolean],
    isCharacterDevice: CallbackTo[Boolean],
    isDirectory: CallbackTo[Boolean],
    isFIFO: CallbackTo[Boolean],
    isFile: CallbackTo[Boolean],
    isSocket: CallbackTo[Boolean],
    isSymbolicLink: CallbackTo[Boolean],
    name: String | Buffer
  ): IDirent = {
    val __obj = js.Dynamic.literal(isBlockDevice = isBlockDevice.toJsFn, isCharacterDevice = isCharacterDevice.toJsFn, isDirectory = isDirectory.toJsFn, isFIFO = isFIFO.toJsFn, isFile = isFile.toJsFn, isSocket = isSocket.toJsFn, isSymbolicLink = isSymbolicLink.toJsFn, name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirent]
  }
  
  extension [Self <: IDirent](x: Self) {
    
    inline def setIsBlockDevice(value: CallbackTo[Boolean]): Self = StObject.set(x, "isBlockDevice", value.toJsFn)
    
    inline def setIsCharacterDevice(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCharacterDevice", value.toJsFn)
    
    inline def setIsDirectory(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDirectory", value.toJsFn)
    
    inline def setIsFIFO(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFIFO", value.toJsFn)
    
    inline def setIsFile(value: CallbackTo[Boolean]): Self = StObject.set(x, "isFile", value.toJsFn)
    
    inline def setIsSocket(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSocket", value.toJsFn)
    
    inline def setIsSymbolicLink(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSymbolicLink", value.toJsFn)
    
    inline def setName(value: String | Buffer): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
