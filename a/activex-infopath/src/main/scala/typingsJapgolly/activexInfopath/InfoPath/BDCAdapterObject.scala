package typingsJapgolly.activexInfopath.InfoPath

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BDCAdapterObject extends StObject {
  
  val EntityName: String
  
  val EntityNamespace: String
  
  /* private */ @JSName("InfoPath.BDCAdapterObject_typekey")
  var InfoPathDotBDCAdapterObject_typekey: BDCAdapterObject
  
  val LOBSystemInstance: String
  
  val Name: String
  
  def Query(): Unit
  
  val QueryAllowed: Boolean
  
  val SpecificFinder: String
  
  def Submit(): Unit
  
  val SubmitAdapterName: String
  
  val SubmitAllowed: Boolean
}
object BDCAdapterObject {
  
  inline def apply(
    EntityName: String,
    EntityNamespace: String,
    InfoPathDotBDCAdapterObject_typekey: BDCAdapterObject,
    LOBSystemInstance: String,
    Name: String,
    Query: Callback,
    QueryAllowed: Boolean,
    SpecificFinder: String,
    Submit: Callback,
    SubmitAdapterName: String,
    SubmitAllowed: Boolean
  ): BDCAdapterObject = {
    val __obj = js.Dynamic.literal(EntityName = EntityName.asInstanceOf[js.Any], EntityNamespace = EntityNamespace.asInstanceOf[js.Any], LOBSystemInstance = LOBSystemInstance.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Query = Query.toJsFn, QueryAllowed = QueryAllowed.asInstanceOf[js.Any], SpecificFinder = SpecificFinder.asInstanceOf[js.Any], Submit = Submit.toJsFn, SubmitAdapterName = SubmitAdapterName.asInstanceOf[js.Any], SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.BDCAdapterObject_typekey")(InfoPathDotBDCAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BDCAdapterObject]
  }
  
  extension [Self <: BDCAdapterObject](x: Self) {
    
    inline def setEntityName(value: String): Self = StObject.set(x, "EntityName", value.asInstanceOf[js.Any])
    
    inline def setEntityNamespace(value: String): Self = StObject.set(x, "EntityNamespace", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotBDCAdapterObject_typekey(value: BDCAdapterObject): Self = StObject.set(x, "InfoPath.BDCAdapterObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setLOBSystemInstance(value: String): Self = StObject.set(x, "LOBSystemInstance", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Callback): Self = StObject.set(x, "Query", value.toJsFn)
    
    inline def setQueryAllowed(value: Boolean): Self = StObject.set(x, "QueryAllowed", value.asInstanceOf[js.Any])
    
    inline def setSpecificFinder(value: String): Self = StObject.set(x, "SpecificFinder", value.asInstanceOf[js.Any])
    
    inline def setSubmit(value: Callback): Self = StObject.set(x, "Submit", value.toJsFn)
    
    inline def setSubmitAdapterName(value: String): Self = StObject.set(x, "SubmitAdapterName", value.asInstanceOf[js.Any])
    
    inline def setSubmitAllowed(value: Boolean): Self = StObject.set(x, "SubmitAllowed", value.asInstanceOf[js.Any])
  }
}
