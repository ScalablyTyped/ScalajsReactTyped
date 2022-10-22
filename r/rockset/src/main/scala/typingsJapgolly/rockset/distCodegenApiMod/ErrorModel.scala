package typingsJapgolly.rockset.distCodegenApiMod

import typingsJapgolly.rockset.distCodegenApiMod.ErrorModel.TypeEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorModel extends StObject {
  
  /**
    * Column where the error happened (if applicable)
    * @type {number}
    * @memberof ErrorModel
    */
  var column: js.UndefOr[Double] = js.undefined
  
  /**
    * Line where the error happened (if applicable)
    * @type {number}
    * @memberof ErrorModel
    */
  var line: js.UndefOr[Double] = js.undefined
  
  /**
    * descriptive message about the error
    * @type {string}
    * @memberof ErrorModel
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Internal trace ID to help with debugging
    * @type {string}
    * @memberof ErrorModel
    */
  var trace_id: js.UndefOr[String] = js.undefined
  
  /**
    * category of the error
    * @type {string}
    * @memberof ErrorModel
    */
  var `type`: js.UndefOr[TypeEnum] = js.undefined
}
object ErrorModel {
  
  inline def apply(): ErrorModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorModel]
  }
  
  @js.native
  sealed trait TypeEnum extends StObject
  /**
    * @export
    * @enum {string}
    */
  @JSImport("rockset/dist/codegen/api", "ErrorModel.TypeEnum")
  @js.native
  object TypeEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TypeEnum & Double] = js.native
    
    @js.native
    sealed trait ALREADYEXISTS
      extends StObject
         with TypeEnum
    /* 6 */ val ALREADYEXISTS: typingsJapgolly.rockset.distCodegenApiMod.ErrorModel.TypeEnum.ALREADYEXISTS & Double = js.native
    
    @js.native
    sealed trait AUTHEXCEPTION
      extends StObject
         with TypeEnum
    /* 0 */ val AUTHEXCEPTION: typingsJapgolly.rockset.distCodegenApiMod.ErrorModel.TypeEnum.AUTHEXCEPTION & Double = js.native
    
    @js.native
    sealed trait BADREQUEST
      extends StObject
         with TypeEnum
    /* 18 */ val BADREQUEST: typingsJapgolly.rockset.distCodegenApiMod.ErrorModel.TypeEnum.BADREQUEST & Double = js.native
    
    @js.native
    sealed trait CONNECTIONERROR
      extends StObject
         with TypeEnum
    /* 16 */ val CONNECTIONERROR: typingsJapgolly.rockset.distCodegenApiMod.ErrorModel.TypeEnum.CONNECTIONERROR & Double = js.native
    
    @js.native
    sealed trait CREATING
      extends StObject
         with TypeEnum
    /* 17 */ val CREATING: typingsJapgolly.rockset.distCodegenApiMod.ErrorModel.TypeEnum.CREATING & Double = js.native
    
    @js.native
    sealed trait DEPENDENTRESOURCES
      extends StObject
         with TypeEnum
    /* 9 */ val DEPENDENTRESOURCES: typingsJapgolly.rockset.distCodegenApiMod.ErrorModel.TypeEnum.DEPENDENTRESOURCES & Double = js.native
    
    @js.native
    sealed trait FORBIDDEN
      extends StObject
         with TypeEnum
    /* 12 */ val FORBIDDEN: typingsJapgolly.rockset.distCodegenApiMod.ErrorModel.TypeEnum.FORBIDDEN & Double = js.native
    
    @js.native
    sealed trait INTEGRATIONNOTFOUND
      extends StObject
         with TypeEnum
    /* 14 */ val INTEGRATIONNOTFOUND: typingsJapgolly.rockset.distCodegenApiMod.ErrorModel.TypeEnum.INTEGRATIONNOTFOUND & Double = js.native
    
    @js.native
    sealed trait INTERNALERROR
      extends StObject
         with TypeEnum
    /* 2 */ val INTERNALERROR: typingsJapgolly.rockset.distCodegenApiMod.ErrorModel.TypeEnum.INTERNALERROR & Double = js.native
    
    @js.native
    sealed trait INVALIDINPUT
      extends StObject
         with TypeEnum
    /* 3 */ val INVALIDINPUT: typingsJapgolly.rockset.distCodegenApiMod.ErrorModel.TypeEnum.INVALIDINPUT & Double = js.native
    
    @js.native
    sealed trait NOTALLOWED
      extends StObject
         with TypeEnum
    /* 7 */ val NOTALLOWED: typingsJapgolly.rockset.distCodegenApiMod.ErrorModel.TypeEnum.NOTALLOWED & Double = js.native
    
    @js.native
    sealed trait NOTFOUND
      extends StObject
         with TypeEnum
    /* 8 */ val NOTFOUND: typingsJapgolly.rockset.distCodegenApiMod.ErrorModel.TypeEnum.NOTFOUND & Double = js.native
    
    @js.native
    sealed trait NOTIMPLEMENTEDYET
      extends StObject
         with TypeEnum
    /* 4 */ val NOTIMPLEMENTEDYET: typingsJapgolly.rockset.distCodegenApiMod.ErrorModel.TypeEnum.NOTIMPLEMENTEDYET & Double = js.native
    
    @js.native
    sealed trait NOTREADY
      extends StObject
         with TypeEnum
    /* 11 */ val NOTREADY: typingsJapgolly.rockset.distCodegenApiMod.ErrorModel.TypeEnum.NOTREADY & Double = js.native
    
    @js.native
    sealed trait QUERYERROR
      extends StObject
         with TypeEnum
    /* 10 */ val QUERYERROR: typingsJapgolly.rockset.distCodegenApiMod.ErrorModel.TypeEnum.QUERYERROR & Double = js.native
    
    @js.native
    sealed trait QUERYTIMEOUT
      extends StObject
         with TypeEnum
    /* 13 */ val QUERYTIMEOUT: typingsJapgolly.rockset.distCodegenApiMod.ErrorModel.TypeEnum.QUERYTIMEOUT & Double = js.native
    
    @js.native
    sealed trait RATELIMITEXCEEDED
      extends StObject
         with TypeEnum
    /* 19 */ val RATELIMITEXCEEDED: typingsJapgolly.rockset.distCodegenApiMod.ErrorModel.TypeEnum.RATELIMITEXCEEDED & Double = js.native
    
    @js.native
    sealed trait RESOURCEEXCEEDED
      extends StObject
         with TypeEnum
    /* 5 */ val RESOURCEEXCEEDED: typingsJapgolly.rockset.distCodegenApiMod.ErrorModel.TypeEnum.RESOURCEEXCEEDED & Double = js.native
    
    @js.native
    sealed trait ROLENOTFOUND
      extends StObject
         with TypeEnum
    /* 15 */ val ROLENOTFOUND: typingsJapgolly.rockset.distCodegenApiMod.ErrorModel.TypeEnum.ROLENOTFOUND & Double = js.native
    
    @js.native
    sealed trait VERSIONEXCEPTION
      extends StObject
         with TypeEnum
    /* 1 */ val VERSIONEXCEPTION: typingsJapgolly.rockset.distCodegenApiMod.ErrorModel.TypeEnum.VERSIONEXCEPTION & Double = js.native
  }
  
  extension [Self <: ErrorModel](x: Self) {
    
    inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setTrace_id(value: String): Self = StObject.set(x, "trace_id", value.asInstanceOf[js.Any])
    
    inline def setTrace_idUndefined: Self = StObject.set(x, "trace_id", js.undefined)
    
    inline def setType(value: TypeEnum): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
