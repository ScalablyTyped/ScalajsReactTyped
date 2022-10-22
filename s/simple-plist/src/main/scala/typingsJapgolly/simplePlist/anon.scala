package typingsJapgolly.simplePlist

import typingsJapgolly.node.fsMod.PathOrFileDescriptor
import typingsJapgolly.node.fsMod.WriteFileOptions
import typingsJapgolly.simplePlist.distTypesMod.PlistJsObj
import typingsJapgolly.simplePlist.distTypesMod.StringOrBuffer
import typingsJapgolly.simplePlist.distTypesMod.callbackFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T](aStringOrBuffer: StringOrBuffer): T = js.native
    def apply[T](aStringOrBuffer: StringOrBuffer, aFile: PathOrFileDescriptor): T = js.native
  }
  
  @js.native
  trait FnCallAFile extends StObject {
    
    def apply[T](aFile: PathOrFileDescriptor): T = js.native
  }
  
  @js.native
  trait FnCallAFileAnObjectOptionsCallback extends StObject {
    
    def apply(
      aFile: PathOrFileDescriptor,
      anObject: PlistJsObj,
      options: WriteFileOptions,
      callback: callbackFn[Unit]
    ): Unit = js.native
    def apply(aFile: PathOrFileDescriptor, anObject: PlistJsObj, options: callbackFn[Unit]): Unit = js.native
  }
  
  @js.native
  trait FnCallAFileCallback extends StObject {
    
    def apply[T](aFile: PathOrFileDescriptor, callback: callbackFn[T]): Unit = js.native
  }
}
