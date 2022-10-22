package typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParameterType extends StObject
@JSImport("typedoc/dist/lib/utils/options/declaration", "ParameterType")
@js.native
object ParameterType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParameterType & Double] = js.native
  
  @js.native
  sealed trait Array
    extends StObject
       with ParameterType
  /* 6 */ val Array: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Array & Double = js.native
  
  @js.native
  sealed trait Boolean
    extends StObject
       with ParameterType
  /* 3 */ val Boolean: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Boolean & Double = js.native
  
  /**
    * An object with true/false flags
    */
  @js.native
  sealed trait Flags
    extends StObject
       with ParameterType
  /* 11 */ val Flags: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Flags & Double = js.native
  
  /**
    * Resolved according to the config directory unless it starts with `**`, after skipping any leading `!` and `#` characters.
    */
  @js.native
  sealed trait GlobArray
    extends StObject
       with ParameterType
  /* 9 */ val GlobArray: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.GlobArray & Double = js.native
  
  @js.native
  sealed trait Map
    extends StObject
       with ParameterType
  /* 4 */ val Map: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Map & Double = js.native
  
  @js.native
  sealed trait Mixed
    extends StObject
       with ParameterType
  /* 5 */ val Mixed: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Mixed & Double = js.native
  
  /**
    * Resolved according to the config directory if it starts with `.`
    */
  @js.native
  sealed trait ModuleArray
    extends StObject
       with ParameterType
  /* 8 */ val ModuleArray: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.ModuleArray & Double = js.native
  
  @js.native
  sealed trait Number
    extends StObject
       with ParameterType
  /* 2 */ val Number: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Number & Double = js.native
  
  /**
    * An unopinionated object that preserves default settings unless explicitly overridden
    */
  @js.native
  sealed trait Object
    extends StObject
       with ParameterType
  /* 10 */ val Object: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Object & Double = js.native
  
  /**
    * Resolved according to the config directory.
    */
  @js.native
  sealed trait Path
    extends StObject
       with ParameterType
  /* 1 */ val Path: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.Path & Double = js.native
  
  /**
    * Resolved according to the config directory.
    */
  @js.native
  sealed trait PathArray
    extends StObject
       with ParameterType
  /* 7 */ val PathArray: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.PathArray & Double = js.native
  
  @js.native
  sealed trait String
    extends StObject
       with ParameterType
  /* 0 */ val String: typingsJapgolly.typedoc.distLibUtilsOptionsDeclarationMod.ParameterType.String & Double = js.native
}
