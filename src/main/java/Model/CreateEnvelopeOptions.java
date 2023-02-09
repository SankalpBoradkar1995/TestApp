package Model;

public class CreateEnvelopeOptions 
{
	private String cdseMode = null;
    private String changeRoutingOrder = null;
    private String completedDocumentsOnly = null;
    private String mergeRolesOnDraft = null;
    private String tabLabelExactMatches = null;

    public void setCdseMode(String cdseMode){
    this.cdseMode = cdseMode; 
    }
    public String getCdseMode() { return this.cdseMode;}

    public void setChangeRoutingOrder(String changeRoutingOrder) {
    this.changeRoutingOrder = changeRoutingOrder;
    }
    public String getChangeRoutingOrder() {
    return this.changeRoutingOrder; 
    }

    public void setCompletedDocumentsOnly(String completedDocumentsOnly)    { 
  this.completedDocumentsOnly = completedDocumentsOnly;
    }
    public String getCompletedDocumentsOnly() {
      return this.completedDocumentsOnly;
    }

    public void setMergeRolesOnDraft(String mergeRolesOnDraft) {
      this.mergeRolesOnDraft = mergeRolesOnDraft;
    }
    public String getMergeRolesOnDraft() { 
    return this.mergeRolesOnDraft;
    }

  public void setTabLabelExactMatches(String tabLabelExactMatches) {
      this.tabLabelExactMatches = tabLabelExactMatches;
    }
    public String getTabLabelExactMatches() {
      return this.tabLabelExactMatches;
    }
}
