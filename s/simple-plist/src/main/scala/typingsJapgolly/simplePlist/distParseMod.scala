package typingsJapgolly.simplePlist

import typingsJapgolly.node.fsMod.PathOrFileDescriptor
import typingsJapgolly.simplePlist.distTypesMod.StringOrBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParseMod {
  
  @JSImport("simple-plist/dist/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse[T](aStringOrBuffer: StringOrBuffer): T = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(aStringOrBuffer.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def parse[T](aStringOrBuffer: StringOrBuffer, aFile: PathOrFileDescriptor): T = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(aStringOrBuffer.asInstanceOf[js.Any], aFile.asInstanceOf[js.Any])).asInstanceOf[T]
}
