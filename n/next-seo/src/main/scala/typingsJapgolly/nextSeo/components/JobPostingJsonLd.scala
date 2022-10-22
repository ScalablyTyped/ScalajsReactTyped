package typingsJapgolly.nextSeo.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextSeo.libJsonldJobPostingMod.EmploymentType
import typingsJapgolly.nextSeo.libJsonldJobPostingMod.ExperienceRequirements
import typingsJapgolly.nextSeo.libJsonldJobPostingMod.HiringOrganization
import typingsJapgolly.nextSeo.libJsonldJobPostingMod.JobPostingJsonLdProps
import typingsJapgolly.nextSeo.libJsonldJobPostingMod.MonetaryAmount
import typingsJapgolly.nextSeo.libJsonldJobPostingMod.Place
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JobPostingJsonLd {
  
  inline def apply(
    datePosted: String,
    description: String,
    hiringOrganization: HiringOrganization,
    title: String,
    validThrough: String
  ): Builder = {
    val __props = js.Dynamic.literal(datePosted = datePosted.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hiringOrganization = hiringOrganization.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], validThrough = validThrough.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[JobPostingJsonLdProps]))
  }
  
  @JSImport("next-seo", "JobPostingJsonLd")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def applicantLocationRequirements(value: String): this.type = set("applicantLocationRequirements", value.asInstanceOf[js.Any])
    
    inline def baseSalary(value: MonetaryAmount): this.type = set("baseSalary", value.asInstanceOf[js.Any])
    
    inline def employmentType(value: EmploymentType | js.Array[EmploymentType]): this.type = set("employmentType", value.asInstanceOf[js.Any])
    
    inline def employmentTypeVarargs(value: EmploymentType*): this.type = set("employmentType", js.Array(value*))
    
    inline def experienceRequirements(value: ExperienceRequirements): this.type = set("experienceRequirements", value.asInstanceOf[js.Any])
    
    inline def jobLocation(value: Place): this.type = set("jobLocation", value.asInstanceOf[js.Any])
    
    inline def jobLocationType(value: String): this.type = set("jobLocationType", value.asInstanceOf[js.Any])
    
    inline def keyOverride(value: String): this.type = set("keyOverride", value.asInstanceOf[js.Any])
    
    inline def scriptId(value: String): this.type = set("scriptId", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: JobPostingJsonLdProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
