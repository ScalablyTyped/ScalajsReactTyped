package typingsJapgolly.sass

import typingsJapgolly.immutable.mod.OrderedMap
import typingsJapgolly.sass.typesValueListMod.ListSeparator
import typingsJapgolly.sass.typesValueListMod.SassList
import typingsJapgolly.sass.typesValueMod.Value
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesValueArgumentListMod {
  
  @JSImport("sass/types/value/argument_list", "SassArgumentList")
  @js.native
  open class SassArgumentList protected () extends SassList {
    def this(contents: js.Array[Value], keywords: OrderedMap[String, Value]) = this()
    /**
      * Creates a new argument list.
      *
      * @param contents - The positional arguments that make up the primary
      * contents of the list. This may be either a plain JavaScript array or an
      * immutable [[List]] from the [`immutable`
      * package](https://immutable-js.com/).
      *
      * @param keywords - The keyword arguments attached to this argument list,
      * whose names should exclude `$`. This can be either a plain JavaScript
      * object with argument names as fields, or an immutable [[OrderedMap]] from
      * the [`immutable` package](https://immutable-js.com/)
      *
      * @param separator - The separator for this list. Defaults to `','`.
      */
    def this(contents: js.Array[Value], keywords: Record[String, Value]) = this()
    def this(contents: typingsJapgolly.immutable.mod.List[Value], keywords: OrderedMap[String, Value]) = this()
    def this(contents: typingsJapgolly.immutable.mod.List[Value], keywords: Record[String, Value]) = this()
    def this(contents: js.Array[Value], keywords: OrderedMap[String, Value], separator: ListSeparator) = this()
    def this(contents: js.Array[Value], keywords: Record[String, Value], separator: ListSeparator) = this()
    def this(
      contents: typingsJapgolly.immutable.mod.List[Value],
      keywords: OrderedMap[String, Value],
      separator: ListSeparator
    ) = this()
    def this(
      contents: typingsJapgolly.immutable.mod.List[Value],
      keywords: Record[String, Value],
      separator: ListSeparator
    ) = this()
    
    /**
      * The keyword arguments attached to this argument list.
      *
      * The argument names don't include `$`.
      *
      * @returns An immutable [[OrderedMap]] from the [`immutable`
      * package](https://immutable-js.com/).
      */
    def keywords: OrderedMap[String, Value] = js.native
  }
}
