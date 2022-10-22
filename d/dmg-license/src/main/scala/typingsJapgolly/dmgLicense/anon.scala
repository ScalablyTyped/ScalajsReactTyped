package typingsJapgolly.dmgLicense

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dmgLicense.dmgLicenseBooleans.`false`
import typingsJapgolly.dmgLicense.dmgLicenseBooleans.`true`
import typingsJapgolly.dmgLicense.dmgLicenseStrings.TEXT
import typingsJapgolly.dmgLicense.dmgLicenseStrings.`RTF `
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.plist.mod.PlistObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[U] extends StObject {
    
    def onNoLanguageName(): js.Promise[U]
  }
  object `0` {
    
    inline def apply[U](onNoLanguageName: CallbackTo[js.Promise[U]]): `0`[U] = {
      val __obj = js.Dynamic.literal(onNoLanguageName = onNoLanguageName.toJsFn)
      __obj.asInstanceOf[`0`[U]]
    }
    
    extension [Self <: `0`[?], U](x: Self & `0`[U]) {
      
      inline def setOnNoLanguageName(value: CallbackTo[js.Promise[U]]): Self = StObject.set(x, "onNoLanguageName", value.toJsFn)
    }
  }
  
  trait `1`[U] extends StObject {
    
    def onNoLanguageName(): U
  }
  object `1` {
    
    inline def apply[U](onNoLanguageName: CallbackTo[U]): `1`[U] = {
      val __obj = js.Dynamic.literal(onNoLanguageName = onNoLanguageName.toJsFn)
      __obj.asInstanceOf[`1`[U]]
    }
    
    extension [Self <: `1`[?], U](x: Self & `1`[U]) {
      
      inline def setOnNoLanguageName(value: CallbackTo[U]): Self = StObject.set(x, "onNoLanguageName", value.toJsFn)
    }
  }
  
  /* Inlined dmg-license.dmg-license/lib/Labels.Labels.CreateOptions & {  includeLanguageName :true} */
  trait CreateOptionsincludeLangu extends StObject {
    
    var includeLanguageName: js.UndefOr[Boolean] & `true`
  }
  object CreateOptionsincludeLangu {
    
    inline def apply(includeLanguageName: js.UndefOr[Boolean] & `true`): CreateOptionsincludeLangu = {
      val __obj = js.Dynamic.literal(includeLanguageName = includeLanguageName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateOptionsincludeLangu]
    }
    
    extension [Self <: CreateOptionsincludeLangu](x: Self) {
      
      inline def setIncludeLanguageName(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "includeLanguageName", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined dmg-license.dmg-license/lib/Labels.Labels.CreateOptions & {  includeLanguageName :false | undefined} */
  trait CreateOptionsincludeLanguIncludeLanguageName extends StObject {
    
    var includeLanguageName: js.UndefOr[Boolean] & js.UndefOr[`false`]
  }
  object CreateOptionsincludeLanguIncludeLanguageName {
    
    inline def apply(includeLanguageName: js.UndefOr[Boolean] & js.UndefOr[`false`]): CreateOptionsincludeLanguIncludeLanguageName = {
      val __obj = js.Dynamic.literal(includeLanguageName = includeLanguageName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateOptionsincludeLanguIncludeLanguageName]
    }
    
    extension [Self <: CreateOptionsincludeLanguIncludeLanguageName](x: Self) {
      
      inline def setIncludeLanguageName(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "includeLanguageName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: Buffer
    
    var `type`: (`RTF `) | TEXT
  }
  object Data {
    
    inline def apply(data: Buffer, `type`: (`RTF `) | TEXT): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(value: (`RTF `) | TEXT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnNoLanguageName extends StObject {
    
    var onNoLanguageName: js.UndefOr[scala.Nothing] = js.undefined
  }
  
  trait Plist extends StObject {
    
    var plist: PlistObject
    
    var plistText: String
  }
  object Plist {
    
    inline def apply(plist: PlistObject, plistText: String): Plist = {
      val __obj = js.Dynamic.literal(plist = plist.asInstanceOf[js.Any], plistText = plistText.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plist]
    }
    
    extension [Self <: Plist](x: Self) {
      
      inline def setPlist(value: PlistObject): Self = StObject.set(x, "plist", value.asInstanceOf[js.Any])
      
      inline def setPlistText(value: String): Self = StObject.set(x, "plistText", value.asInstanceOf[js.Any])
    }
  }
}
