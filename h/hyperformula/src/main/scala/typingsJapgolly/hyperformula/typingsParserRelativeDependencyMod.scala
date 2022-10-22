package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.typingsAbsoluteCellRangeMod.AbsoluteCellRange
import typingsJapgolly.hyperformula.typingsAbsoluteCellRangeMod.AbsoluteColumnRange
import typingsJapgolly.hyperformula.typingsAbsoluteCellRangeMod.AbsoluteRowRange
import typingsJapgolly.hyperformula.typingsCellDependencyMod.CellDependency
import typingsJapgolly.hyperformula.typingsCellMod.SimpleCellAddress_
import typingsJapgolly.hyperformula.typingsParserColumnAddressMod.ColumnAddress
import typingsJapgolly.hyperformula.typingsParserMod.CellAddress
import typingsJapgolly.hyperformula.typingsParserRowAddressMod.RowAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsParserRelativeDependencyMod {
  
  @JSImport("hyperformula/typings/parser/RelativeDependency", "AddressDependency")
  @js.native
  open class AddressDependency protected ()
    extends StObject
       with RelativeDependency {
    def this(dependency: CellAddress) = this()
    
    def absolutize(baseAddress: SimpleCellAddress_): SimpleCellAddress_ = js.native
    
    val dependency: CellAddress = js.native
  }
  
  @JSImport("hyperformula/typings/parser/RelativeDependency", "CellRangeDependency")
  @js.native
  open class CellRangeDependency protected ()
    extends StObject
       with RangeDependency {
    def this(start: CellAddress, end: CellAddress) = this()
    
    def absolutize(baseAddress: SimpleCellAddress_): AbsoluteCellRange = js.native
    
    val end: CellAddress = js.native
    
    val start: CellAddress = js.native
  }
  
  @JSImport("hyperformula/typings/parser/RelativeDependency", "ColumnRangeDependency")
  @js.native
  open class ColumnRangeDependency protected ()
    extends StObject
       with RangeDependency {
    def this(start: ColumnAddress, end: ColumnAddress) = this()
    
    def absolutize(baseAddress: SimpleCellAddress_): AbsoluteColumnRange = js.native
    
    val end: ColumnAddress = js.native
    
    val start: ColumnAddress = js.native
  }
  
  @JSImport("hyperformula/typings/parser/RelativeDependency", "NamedExpressionDependency")
  @js.native
  open class NamedExpressionDependency protected ()
    extends StObject
       with CellDependency
       with RelativeDependency {
    def this(name: String) = this()
    
    def absolutize(_baseAddress: SimpleCellAddress_): this.type = js.native
    
    val name: String = js.native
  }
  
  @JSImport("hyperformula/typings/parser/RelativeDependency", "RowRangeDependency")
  @js.native
  open class RowRangeDependency protected ()
    extends StObject
       with RangeDependency {
    def this(start: RowAddress, end: RowAddress) = this()
    
    def absolutize(baseAddress: SimpleCellAddress_): AbsoluteRowRange = js.native
    
    val end: RowAddress = js.native
    
    val start: RowAddress = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hyperformula.typingsParserRelativeDependencyMod.CellRangeDependency
    - typingsJapgolly.hyperformula.typingsParserRelativeDependencyMod.ColumnRangeDependency
    - typingsJapgolly.hyperformula.typingsParserRelativeDependencyMod.RowRangeDependency
  */
  trait RangeDependency
    extends StObject
       with RelativeDependency
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.hyperformula.typingsParserRelativeDependencyMod.AddressDependency
    - typingsJapgolly.hyperformula.typingsParserRelativeDependencyMod.RangeDependency
    - typingsJapgolly.hyperformula.typingsParserRelativeDependencyMod.NamedExpressionDependency
  */
  trait RelativeDependency extends StObject
}
