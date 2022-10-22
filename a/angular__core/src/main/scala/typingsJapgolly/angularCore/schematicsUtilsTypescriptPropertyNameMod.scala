package typingsJapgolly.angularCore

import typingsJapgolly.typescript.mod.PropertyName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schematicsUtilsTypescriptPropertyNameMod {
  
  @JSImport("@angular/core/schematics/utils/typescript/property_name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPropertyNameText(node: PropertyName): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyNameText")(node.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def hasPropertyNameText(node: PropertyName): /* is @angular/core.@angular/core/schematics/utils/typescript/property_name.PropertyNameWithText */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPropertyNameText")(node.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/core.@angular/core/schematics/utils/typescript/property_name.PropertyNameWithText */ Boolean]
  
  /** Type that describes a property name with an obtainable text. */
  /* Inlined std.Exclude<typescript.typescript.PropertyName, typescript.typescript.ComputedPropertyName> */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.angularCore.angularCoreStrings.escapedText
    - typingsJapgolly.angularCore.angularCoreStrings.text
    - typingsJapgolly.angularCore.angularCoreStrings.originalKeywordKind
    - typingsJapgolly.angularCore.angularCoreStrings.isInJSDocNamespace
  */
  trait PropertyNameWithText extends StObject
  object PropertyNameWithText {
    
    inline def escapedText: typingsJapgolly.angularCore.angularCoreStrings.escapedText = "escapedText".asInstanceOf[typingsJapgolly.angularCore.angularCoreStrings.escapedText]
    
    inline def isInJSDocNamespace: typingsJapgolly.angularCore.angularCoreStrings.isInJSDocNamespace = "isInJSDocNamespace".asInstanceOf[typingsJapgolly.angularCore.angularCoreStrings.isInJSDocNamespace]
    
    inline def originalKeywordKind: typingsJapgolly.angularCore.angularCoreStrings.originalKeywordKind = "originalKeywordKind".asInstanceOf[typingsJapgolly.angularCore.angularCoreStrings.originalKeywordKind]
    
    inline def text: typingsJapgolly.angularCore.angularCoreStrings.text = "text".asInstanceOf[typingsJapgolly.angularCore.angularCoreStrings.text]
  }
}
