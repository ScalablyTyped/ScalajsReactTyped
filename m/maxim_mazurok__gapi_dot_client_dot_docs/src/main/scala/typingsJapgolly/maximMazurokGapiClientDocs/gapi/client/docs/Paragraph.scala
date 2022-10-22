package typingsJapgolly.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paragraph extends StObject {
  
  /** The bullet for this paragraph. If not present, the paragraph does not belong to a list. */
  var bullet: js.UndefOr[Bullet] = js.undefined
  
  /** The content of the paragraph broken down into its component parts. */
  var elements: js.UndefOr[js.Array[ParagraphElement]] = js.undefined
  
  /** The style of this paragraph. */
  var paragraphStyle: js.UndefOr[ParagraphStyle] = js.undefined
  
  /** The IDs of the positioned objects tethered to this paragraph. */
  var positionedObjectIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The suggested changes to this paragraph's bullet. */
  var suggestedBulletChanges: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedBullet} */ js.Any
  ] = js.undefined
  
  /** The suggested paragraph style changes to this paragraph, keyed by suggestion ID. */
  var suggestedParagraphStyleChanges: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedParagraphStyle} */ js.Any
  ] = js.undefined
  
  /** The IDs of the positioned objects that are suggested to be attached to this paragraph, keyed by suggestion ID. */
  var suggestedPositionedObjectIds: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.ObjectReferences} */ js.Any
  ] = js.undefined
}
object Paragraph {
  
  inline def apply(): Paragraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Paragraph]
  }
  
  extension [Self <: Paragraph](x: Self) {
    
    inline def setBullet(value: Bullet): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
    
    inline def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
    
    inline def setElements(value: js.Array[ParagraphElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: ParagraphElement*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setParagraphStyle(value: ParagraphStyle): Self = StObject.set(x, "paragraphStyle", value.asInstanceOf[js.Any])
    
    inline def setParagraphStyleUndefined: Self = StObject.set(x, "paragraphStyle", js.undefined)
    
    inline def setPositionedObjectIds(value: js.Array[String]): Self = StObject.set(x, "positionedObjectIds", value.asInstanceOf[js.Any])
    
    inline def setPositionedObjectIdsUndefined: Self = StObject.set(x, "positionedObjectIds", js.undefined)
    
    inline def setPositionedObjectIdsVarargs(value: String*): Self = StObject.set(x, "positionedObjectIds", js.Array(value*))
    
    inline def setSuggestedBulletChanges(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedBullet} */ js.Any
    ): Self = StObject.set(x, "suggestedBulletChanges", value.asInstanceOf[js.Any])
    
    inline def setSuggestedBulletChangesUndefined: Self = StObject.set(x, "suggestedBulletChanges", js.undefined)
    
    inline def setSuggestedParagraphStyleChanges(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.SuggestedParagraphStyle} */ js.Any
    ): Self = StObject.set(x, "suggestedParagraphStyleChanges", value.asInstanceOf[js.Any])
    
    inline def setSuggestedParagraphStyleChangesUndefined: Self = StObject.set(x, "suggestedParagraphStyleChanges", js.undefined)
    
    inline def setSuggestedPositionedObjectIds(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.docs.gapi.client.docs.ObjectReferences} */ js.Any
    ): Self = StObject.set(x, "suggestedPositionedObjectIds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedPositionedObjectIdsUndefined: Self = StObject.set(x, "suggestedPositionedObjectIds", js.undefined)
  }
}
