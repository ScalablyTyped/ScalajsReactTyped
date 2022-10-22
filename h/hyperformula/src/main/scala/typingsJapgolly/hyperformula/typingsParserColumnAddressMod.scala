package typingsJapgolly.hyperformula

import typingsJapgolly.hyperformula.typingsCellMod.SimpleCellAddress_
import typingsJapgolly.hyperformula.typingsMaybeMod.Maybe
import typingsJapgolly.hyperformula.typingsParserAddressMod.AddressWithColumn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsParserColumnAddressMod {
  
  @JSImport("hyperformula/typings/parser/ColumnAddress", "ColumnAddress")
  @js.native
  open class ColumnAddress protected ()
    extends StObject
       with AddressWithColumn {
    def this(`type`: ReferenceType, col: Double) = this()
    def this(`type`: ReferenceType, col: Double, sheet: Double) = this()
    
    def exceedsSheetSizeLimits(maxColumns: Double): Boolean = js.native
    
    def hash(withSheet: Boolean): String = js.native
    
    def isAbsolute(): Boolean = js.native
    
    def isInvalid(baseAddress: SimpleCellAddress_): Boolean = js.native
    
    val `type`: ReferenceType = js.native
    
    def unparse(baseAddress: SimpleCellAddress_): Maybe[String] = js.native
  }
  /* static members */
  object ColumnAddress {
    
    @JSImport("hyperformula/typings/parser/ColumnAddress", "ColumnAddress")
    @js.native
    val ^ : js.Any = js.native
    
    inline def absolute(column: Double): ColumnAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("absolute")(column.asInstanceOf[js.Any]).asInstanceOf[ColumnAddress]
    inline def absolute(column: Double, sheet: Double): ColumnAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("absolute")(column.asInstanceOf[js.Any], sheet.asInstanceOf[js.Any])).asInstanceOf[ColumnAddress]
    
    inline def compareByAbsoluteAddress(baseAddress: SimpleCellAddress_): js.Function2[/* colA */ this.type, /* colB */ this.type, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("compareByAbsoluteAddress")(baseAddress.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* colA */ this.type, /* colB */ this.type, Double]]
    
    inline def relative(column: Double): ColumnAddress = ^.asInstanceOf[js.Dynamic].applyDynamic("relative")(column.asInstanceOf[js.Any]).asInstanceOf[ColumnAddress]
    inline def relative(column: Double, sheet: Double): ColumnAddress = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(column.asInstanceOf[js.Any], sheet.asInstanceOf[js.Any])).asInstanceOf[ColumnAddress]
  }
  
  @js.native
  sealed trait ReferenceType extends StObject
  @JSImport("hyperformula/typings/parser/ColumnAddress", "ReferenceType")
  @js.native
  object ReferenceType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ReferenceType & String] = js.native
    
    @js.native
    sealed trait ABSOLUTE
      extends StObject
         with ReferenceType
    /* "ABSOLUTE" */ val ABSOLUTE: typingsJapgolly.hyperformula.typingsParserColumnAddressMod.ReferenceType.ABSOLUTE & String = js.native
    
    @js.native
    sealed trait RELATIVE
      extends StObject
         with ReferenceType
    /* "RELATIVE" */ val RELATIVE: typingsJapgolly.hyperformula.typingsParserColumnAddressMod.ReferenceType.RELATIVE & String = js.native
  }
}
