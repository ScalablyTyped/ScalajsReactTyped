package typingsJapgolly.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BreadcrumbsSeparatorStyle extends StObject
@JSImport("sap/m/library", "BreadcrumbsSeparatorStyle")
@js.native
object BreadcrumbsSeparatorStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BreadcrumbsSeparatorStyle & String] = js.native
  
  /**
    * The separator will appear as "\"
    */
  @js.native
  sealed trait BackSlash
    extends StObject
       with BreadcrumbsSeparatorStyle
  /* "BackSlash" */ val BackSlash: typingsJapgolly.openui5.sapMLibraryMod.BreadcrumbsSeparatorStyle.BackSlash & String = js.native
  
  /**
    * The separator will appear as "\\"
    */
  @js.native
  sealed trait DoubleBackSlash
    extends StObject
       with BreadcrumbsSeparatorStyle
  /* "DoubleBackSlash" */ val DoubleBackSlash: typingsJapgolly.openui5.sapMLibraryMod.BreadcrumbsSeparatorStyle.DoubleBackSlash & String = js.native
  
  /**
    * The separator will appear as ">>"
    */
  @js.native
  sealed trait DoubleGreaterThan
    extends StObject
       with BreadcrumbsSeparatorStyle
  /* "DoubleGreaterThan" */ val DoubleGreaterThan: typingsJapgolly.openui5.sapMLibraryMod.BreadcrumbsSeparatorStyle.DoubleGreaterThan & String = js.native
  
  /**
    * The separator will appear as "//"
    */
  @js.native
  sealed trait DoubleSlash
    extends StObject
       with BreadcrumbsSeparatorStyle
  /* "DoubleSlash" */ val DoubleSlash: typingsJapgolly.openui5.sapMLibraryMod.BreadcrumbsSeparatorStyle.DoubleSlash & String = js.native
  
  /**
    * The separator will appear as ">"
    */
  @js.native
  sealed trait GreaterThan
    extends StObject
       with BreadcrumbsSeparatorStyle
  /* "GreaterThan" */ val GreaterThan: typingsJapgolly.openui5.sapMLibraryMod.BreadcrumbsSeparatorStyle.GreaterThan & String = js.native
  
  /**
    * The separator will appear as "/"
    */
  @js.native
  sealed trait Slash
    extends StObject
       with BreadcrumbsSeparatorStyle
  /* "Slash" */ val Slash: typingsJapgolly.openui5.sapMLibraryMod.BreadcrumbsSeparatorStyle.Slash & String = js.native
}
