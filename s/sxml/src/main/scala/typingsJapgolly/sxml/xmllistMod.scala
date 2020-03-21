package typingsJapgolly.sxml

import typingsJapgolly.sxml.xmlMod.XML
import typingsJapgolly.tstl.mod.Vector
import typingsJapgolly.tstl.vectorMod.Vector.Iterator
import typingsJapgolly.tstl.vectorMod.Vector.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sxml/lib/XMLList", JSImport.Namespace)
@js.native
object xmllistMod extends js.Object {
  @js.native
  class XMLList () extends Vector[XML] {
    def getTag(): String = js.native
    def toString(level: Double): String = js.native
  }
  
  @js.native
  object XMLList extends js.Object {
    type Iterator_ = Iterator[XML]
    type ReverseIterator_ = ReverseIterator[XML]
    type iterator = Iterator_
    type reverseIterator = ReverseIterator_
  }
  
}

