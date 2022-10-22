package typingsJapgolly.azureCoreClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.azureCoreClient.mod.BaseMapper
  - typingsJapgolly.azureCoreClient.mod.CompositeMapper
  - typingsJapgolly.azureCoreClient.mod.SequenceMapper
  - typingsJapgolly.azureCoreClient.mod.DictionaryMapper
  - typingsJapgolly.azureCoreClient.mod.EnumMapper
*/
trait Mapper extends StObject
object Mapper {
  
  inline def BaseMapper(`type`: MapperType): typingsJapgolly.azureCoreClient.mod.BaseMapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.azureCoreClient.mod.BaseMapper]
  }
  
  inline def CompositeMapper(`type`: CompositeMapperType): typingsJapgolly.azureCoreClient.mod.CompositeMapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.azureCoreClient.mod.CompositeMapper]
  }
  
  inline def DictionaryMapper(`type`: DictionaryMapperType): typingsJapgolly.azureCoreClient.mod.DictionaryMapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.azureCoreClient.mod.DictionaryMapper]
  }
  
  inline def EnumMapper(`type`: EnumMapperType): typingsJapgolly.azureCoreClient.mod.EnumMapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.azureCoreClient.mod.EnumMapper]
  }
  
  inline def SequenceMapper(`type`: SequenceMapperType): typingsJapgolly.azureCoreClient.mod.SequenceMapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.azureCoreClient.mod.SequenceMapper]
  }
}
