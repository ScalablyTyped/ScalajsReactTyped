package typingsJapgolly.json2csv

import typingsJapgolly.json2csv.mod.Options
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.node.streamMod.TransformOptions
import typingsJapgolly.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object json2csvasyncparserMod {
  
  @JSImport("json2csv/JSON2CSVAsyncParser", JSImport.Namespace)
  @js.native
  open class ^[T] () extends JSON2CSVAsyncParser[T] {
    def this(opts: Options[T]) = this()
    def this(opts: Unit, transformOpts: TransformOptions) = this()
    def this(opts: Options[T], transformOpts: TransformOptions) = this()
  }
  
  @js.native
  trait JSON2CSVAsyncParser[T]
    extends typingsJapgolly.json2csv.json2csvbaseMod.^[T] {
    
    def fromInput(input: Readable): JSON2CSVAsyncParser[T] = js.native
    
    var input: Transform = js.native
    
    var processor: Writable = js.native
    
    def promise(): js.Promise[js.UndefOr[String]] = js.native
    def promise(returnCSV: Boolean): js.Promise[js.UndefOr[String]] = js.native
    
    def throughTransform(transform: Transform): JSON2CSVAsyncParser[T] = js.native
    
    def toOutput(output: Writable): JSON2CSVAsyncParser[T] = js.native
    
    var transform: typingsJapgolly.json2csv.json2csvtransformMod.^[T] = js.native
  }
}
