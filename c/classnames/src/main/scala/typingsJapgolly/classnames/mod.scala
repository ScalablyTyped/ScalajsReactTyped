package typingsJapgolly.classnames

import typingsJapgolly.std.Array
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A simple JavaScript utility for conditionally joining classNames together.
    */
  inline def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type classNames.ArgumentArray is not an array type */ args: ArgumentArray
  ): String = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("classnames", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Argument = Value | Mapping | ArgumentArray
  
  @js.native
  trait ArgumentArray
    extends StObject
       with Array[Argument]
  
  type Mapping = Record[String, Any]
  
  type Value = js.UndefOr[String | Double | Boolean | Null]
}
