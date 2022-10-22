package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InternalSymbolName extends StObject
@JSImport("typescript", "InternalSymbolName")
@js.native
object InternalSymbolName extends StObject {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[InternalSymbolName & java.lang.String] = js.native
  
  @js.native
  sealed trait Call
    extends StObject
       with InternalSymbolName
  /* "__call" */ val Call: typingsJapgolly.typescript.mod.InternalSymbolName.Call & java.lang.String = js.native
  
  @js.native
  sealed trait Class
    extends StObject
       with InternalSymbolName
  /* "__class" */ val Class: typingsJapgolly.typescript.mod.InternalSymbolName.Class & java.lang.String = js.native
  
  @js.native
  sealed trait Computed
    extends StObject
       with InternalSymbolName
  /* "__computed" */ val Computed: typingsJapgolly.typescript.mod.InternalSymbolName.Computed & java.lang.String = js.native
  
  @js.native
  sealed trait Constructor
    extends StObject
       with InternalSymbolName
  /* "__constructor" */ val Constructor: typingsJapgolly.typescript.mod.InternalSymbolName.Constructor & java.lang.String = js.native
  
  @js.native
  sealed trait Default
    extends StObject
       with InternalSymbolName
  /* "default" */ val Default: typingsJapgolly.typescript.mod.InternalSymbolName.Default & java.lang.String = js.native
  
  @js.native
  sealed trait ExportEquals
    extends StObject
       with InternalSymbolName
  /* "export=" */ val ExportEquals: typingsJapgolly.typescript.mod.InternalSymbolName.ExportEquals & java.lang.String = js.native
  
  @js.native
  sealed trait ExportStar
    extends StObject
       with InternalSymbolName
  /* "__export" */ val ExportStar: typingsJapgolly.typescript.mod.InternalSymbolName.ExportStar & java.lang.String = js.native
  
  @js.native
  sealed trait Function
    extends StObject
       with InternalSymbolName
  /* "__function" */ val Function: typingsJapgolly.typescript.mod.InternalSymbolName.Function & java.lang.String = js.native
  
  @js.native
  sealed trait Global
    extends StObject
       with InternalSymbolName
  /* "__global" */ val Global: typingsJapgolly.typescript.mod.InternalSymbolName.Global & java.lang.String = js.native
  
  @js.native
  sealed trait Index
    extends StObject
       with InternalSymbolName
  /* "__index" */ val Index: typingsJapgolly.typescript.mod.InternalSymbolName.Index & java.lang.String = js.native
  
  @js.native
  sealed trait JSXAttributes
    extends StObject
       with InternalSymbolName
  /* "__jsxAttributes" */ val JSXAttributes: typingsJapgolly.typescript.mod.InternalSymbolName.JSXAttributes & java.lang.String = js.native
  
  @js.native
  sealed trait Missing
    extends StObject
       with InternalSymbolName
  /* "__missing" */ val Missing: typingsJapgolly.typescript.mod.InternalSymbolName.Missing & java.lang.String = js.native
  
  @js.native
  sealed trait New
    extends StObject
       with InternalSymbolName
  /* "__new" */ val New: typingsJapgolly.typescript.mod.InternalSymbolName.New & java.lang.String = js.native
  
  @js.native
  sealed trait Object
    extends StObject
       with InternalSymbolName
  /* "__object" */ val Object: typingsJapgolly.typescript.mod.InternalSymbolName.Object & java.lang.String = js.native
  
  @js.native
  sealed trait Resolving
    extends StObject
       with InternalSymbolName
  /* "__resolving__" */ val Resolving: typingsJapgolly.typescript.mod.InternalSymbolName.Resolving & java.lang.String = js.native
  
  @js.native
  sealed trait This
    extends StObject
       with InternalSymbolName
  /* "this" */ val This: typingsJapgolly.typescript.mod.InternalSymbolName.This & java.lang.String = js.native
  
  @js.native
  sealed trait Type
    extends StObject
       with InternalSymbolName
  /* "__type" */ val Type: typingsJapgolly.typescript.mod.InternalSymbolName.Type & java.lang.String = js.native
}
