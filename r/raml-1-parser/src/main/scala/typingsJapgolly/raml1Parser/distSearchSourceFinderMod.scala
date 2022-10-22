package typingsJapgolly.raml1Parser

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IParseResult
import typingsJapgolly.ramlDefinitionSystem.mod.IHasExtra
import typingsJapgolly.ramlDefinitionSystem.mod.IProperty
import typingsJapgolly.ramlDefinitionSystem.mod.ITypeDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSearchSourceFinderMod {
  
  @JSImport("raml-1-parser/dist/search/sourceFinder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findRTypeByNominal(
    nominalType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ramlTypes.nominalInterfaces.ITypeDefinition */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findRTypeByNominal")(nominalType.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getExtraProviderSource(extraProvider: IHasExtra): IHighLevelSourceProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtraProviderSource")(extraProvider.asInstanceOf[js.Any]).asInstanceOf[IHighLevelSourceProvider]
  
  inline def getNominalPropertySource(`type`: ITypeDefinition, name: String): IHighLevelSourceProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("getNominalPropertySource")(`type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[IHighLevelSourceProvider]
  
  inline def getNominalPropertySource2(property: IProperty): IHighLevelSourceProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getNominalPropertySource2")(property.asInstanceOf[js.Any]).asInstanceOf[IHighLevelSourceProvider]
  
  inline def getNominalTypeSource(nominalType: ITypeDefinition): IHighLevelSourceProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getNominalTypeSource")(nominalType.asInstanceOf[js.Any]).asInstanceOf[IHighLevelSourceProvider]
  
  inline def getRTypeSource(
    rType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ramlTypes.IParsedType */ Any
  ): IHighLevelSourceProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getRTypeSource")(rType.asInstanceOf[js.Any]).asInstanceOf[IHighLevelSourceProvider]
  
  trait IHighLevelSourceProvider extends StObject {
    
    def getSource(): IParseResult
  }
  object IHighLevelSourceProvider {
    
    inline def apply(getSource: CallbackTo[IParseResult]): IHighLevelSourceProvider = {
      val __obj = js.Dynamic.literal(getSource = getSource.toJsFn)
      __obj.asInstanceOf[IHighLevelSourceProvider]
    }
    
    extension [Self <: IHighLevelSourceProvider](x: Self) {
      
      inline def setGetSource(value: CallbackTo[IParseResult]): Self = StObject.set(x, "getSource", value.toJsFn)
    }
  }
}
