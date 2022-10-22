package typingsJapgolly.nextSeo.components

import org.scalajs.dom.Location
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextSeo.libJsonldEventMod.EventJsonLdProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventJsonLd {
  
  inline def apply(endDate: String, location: Location, name: String, startDate: String): Builder = {
    val __props = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[EventJsonLdProps]))
  }
  
  @JSImport("next-seo", "EventJsonLd")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def aggregateOffer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AggregateOffer */ Any
    ): this.type = set("aggregateOffer", value.asInstanceOf[js.Any])
    
    inline def description(value: String): this.type = set("description", value.asInstanceOf[js.Any])
    
    inline def eventAttendanceMode(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventAttendanceMode */ Any
    ): this.type = set("eventAttendanceMode", value.asInstanceOf[js.Any])
    
    inline def eventStatus(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventStatus */ Any
    ): this.type = set("eventStatus", value.asInstanceOf[js.Any])
    
    inline def images(value: js.Array[String]): this.type = set("images", value.asInstanceOf[js.Any])
    
    inline def imagesVarargs(value: String*): this.type = set("images", js.Array(value*))
    
    inline def offers(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offers */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offers */ Any
        ])
    ): this.type = set("offers", value.asInstanceOf[js.Any])
    
    inline def offersVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Offers */ Any)*
    ): this.type = set("offers", js.Array(value*))
    
    inline def organizer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Organizer */ Any
    ): this.type = set("organizer", value.asInstanceOf[js.Any])
    
    inline def performers(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Performer */ Any) | (js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Performer */ Any
        ])
    ): this.type = set("performers", value.asInstanceOf[js.Any])
    
    inline def performersVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Performer */ Any)*
    ): this.type = set("performers", js.Array(value*))
    
    inline def scriptId(value: String): this.type = set("scriptId", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def url(value: String): this.type = set("url", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: EventJsonLdProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
